package com.schalar.jikan.model;

import com.schalar.jikan.model.common.MalUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@SuppressWarnings("unused")
public abstract class Model {

    public String requestHash;
    public Boolean requestCached;
    public Integer requestCacheExpiry;

    private final Map<Field, Function<Object, ?>> fieldFunctionMap = new HashMap<>();

    public void addCustomFunctionForField(String fieldName, Function<Object, ?> function) {
        try {
            addCustomFunctionForField(getClass().getDeclaredField(fieldName), function);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void addCustomFunctionForField(Field field, Function<Object, ?> function) {
        this.fieldFunctionMap.put(field, function);
    }

    public Boolean doesFieldHaveCustomFunction(Field field) {
        return this.fieldFunctionMap.containsKey(field);
    }

    public Function<Object, ?> getCustomFunctionForField(Field field) {
        return this.fieldFunctionMap.get(field);
    }

    public static @NotNull Function<Object, ?> buildUrlList() {
        return (Function<Object, Object>) object -> {
            JSONArray jsonArray = (JSONArray) object;
            List<MalUrl> list = new ArrayList<>();
            jsonArray.forEach(o -> {
                JSONObject jsonObject = (JSONObject) o;
                list.add(new MalUrl(jsonObject.getString("name"), jsonObject.getString("url")));
            });
            return list;
        };
    }

    public static @NotNull Function<Object, ?> buildStringList() {
        return (Function<Object, Object>) object -> {
            JSONArray jsonArray = (JSONArray) object;
            List<String> strings = new ArrayList<>();
            jsonArray.forEach(o -> strings.add((String) o));
            return strings;
        };
    }

    public static @NotNull Function<Object, ?> buildDateMap() {
        return (Function<Object, Object>) object -> {
            JSONObject jsonObject = (JSONObject) object;
            return Map.of(
                    "from", jsonObject.get("from") != JSONObject.NULL ? LocalDateTime.parse(jsonObject.getString("from").replace("+00:00", "")) : LocalDateTime.MIN,
                    "to", jsonObject.get("to") != JSONObject.NULL ? LocalDateTime.parse(jsonObject.getString("to").replace("+00:00", "")) : LocalDateTime.MIN
            );
        };
    }

    @Override
    public String toString() {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder(this.getClass().getSimpleName() + "{");

        for (Field field : this.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(this);

                if (i > 0 && i < this.getClass().getDeclaredFields().length)
                    stringBuilder.append(", ");
                if (value instanceof Integer || value instanceof Double || value instanceof Boolean || value == null) {
                    stringBuilder.append(name).append("=").append(value);
                } else {
                    stringBuilder.append(name).append("='").append(value).append("'");
                }

                i++;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return stringBuilder.append("}").toString();
    }

}
