package com.schalar.jikan.parser;

import com.schalar.jikan.model.Model;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetadataParser {

    private final String className;

    public MetadataParser(String className) {
        this.className = className;
    }

    public HashMap<String, Map<String, Map<String, Map<String, String>>>> getParsedProperties() {
        try {
            Class<?> clazz = Class.forName(this.className);

            var properties = new HashMap<String, Map<String, Map<String, Map<String, String>>>>();
            var propertiesClass = new HashMap<String, Map<String, Map<String, String>>>();
            var propertiesActual = new HashMap<String, Map<String, String>>();

            if (clazz.getSuperclass() != Object.class || clazz.getSuperclass() != Model.class) {
                for (Field property : clazz.getSuperclass().getDeclaredFields()) {
                    if (List.of("requestCached", "requestCacheExpiry", "requestHash", "fieldFunctionMap").contains(property.getName())) continue;
                    propertiesActual.put(property.getName(), Map.of("type", sanitize(property.getGenericType().getTypeName())));
                }
            }

            for (Field property : clazz.getDeclaredFields()) {
                propertiesActual.put(property.getName(), Map.of("type", sanitize(property.getGenericType().getTypeName())));
            }

            propertiesClass.put("properties", propertiesActual);
            properties.put(this.className, propertiesClass);

            return properties;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    private String sanitize(@NotNull String typeName) {
        String[] strings = typeName.split("\\.");
        return strings[strings.length - 1].endsWith(">") ? "List<" + strings[strings.length - 1] : strings[strings.length - 1];
    }

}
