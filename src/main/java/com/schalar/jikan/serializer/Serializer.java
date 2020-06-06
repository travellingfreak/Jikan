package com.schalar.jikan.serializer;

import com.schalar.jikan.model.Model;
import com.schalar.jikan.model.common.MalUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

public class Serializer<T extends Model> {

    private String className;

    public T deserialize(String body, @NotNull Class<T> clazz) {
        this.className = clazz.getSimpleName();

        Map<String, Object> data = invokeObject(body);

        try {
            T t = clazz.getDeclaredConstructor().newInstance();

            for (Field field : clazz.getSuperclass().getDeclaredFields()) {
                if (data.containsKey(field.getName())) {
                    field.setAccessible(true);
                    if (data.get(field.getName()) == JSONObject.NULL) continue;
                    field.set(t, data.get(field.getName()));
                }
            }

            setFieldValue(data, t, clazz.getDeclaredFields(), clazz);

            return t;
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<T> deserialize(String body, @NotNull String className) {
        this.className = className.replace("List<class ", "").replace(">", "");

        try {
            List<Map<String, Object>> data = invokeArray(body);
            List<T> list = new ArrayList<>();
            Class<T> clazz = (Class<T>) Class.forName(this.className);

            data.forEach(stringObjectMap -> {
                try {
                    T t = clazz.getDeclaredConstructor().newInstance();
                    setFieldValue(stringObjectMap, t, clazz.getDeclaredFields(), clazz);
                    list.add(t);
                } catch (IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            });
            return list;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    private @NotNull Map<String, Object> invokeObject(String body) {
        Map<String, Object> stringObjectMap = new HashMap<>();

        JSONObject jsonObject = new JSONObject(body);

        jsonObject.keys().forEachRemaining(s -> {
            if (s.contains("_")) {
                String updatedFieldName = Arrays.stream(s.split("_")).map(s1 -> Character.toUpperCase(s1.charAt(0)) + s1.substring(1).toLowerCase()).collect(Collectors.joining());
                updatedFieldName = updatedFieldName.substring(0, 1).toLowerCase() + updatedFieldName.substring(1);
                stringObjectMap.put(updatedFieldName, jsonObject.get(s));
                return;
            }

            stringObjectMap.put(s, jsonObject.get(s));
        });

        return stringObjectMap;
    }

    private @NotNull List<Map<String, Object>> invokeArray(String body) {
        List<Map<String, Object>> list = new ArrayList<>();

        JSONArray jsonArray = new JSONArray(body);
        jsonArray.forEach(o -> {
            JSONObject jsonObject = (JSONObject) o;
            Map<String, Object> map = new HashMap<>();
            jsonObject.keys().forEachRemaining(s -> {
                if (s.contains("_")) {
                    String[] strings = s.split("_");
                    String updatedFieldName = strings[0] + strings[1].substring(0, 1).toUpperCase() + strings[1].substring(1);
                    map.put(updatedFieldName, jsonObject.get(s));
                    return;
                }

                map.put(s, jsonObject.get(s));
            });
            list.add(map);
        });

        return list;
    }

    private void setFieldValue(Map<String, Object> data, T t, Field @NotNull [] declaredFields, Class<T> clazz) throws IllegalAccessException {
        for (Field field : declaredFields) {
            if (data.containsKey(field.getName())) {
                field.setAccessible(true);

                if (t.doesFieldHaveCustomFunction(field)) {
                    field.set(t, t.getCustomFunctionForField(field).apply(data.get(field.getName())));
                    continue;
                }

                if (data.get(field.getName()) == JSONObject.NULL) continue;

                field.set(t, data.get(field.getName()));
                //TODO: Look into String \n replacement.
            } else if (field.getName().equals("malUrl")) {
                JSONObject jsonObject = (JSONObject) data.get("meta");
                field.set(t, new MalUrl(jsonObject.getString("name"), jsonObject.getString("url")));
            }
        }
    }

}
