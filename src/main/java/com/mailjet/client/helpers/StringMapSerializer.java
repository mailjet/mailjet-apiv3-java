package com.mailjet.client.helpers;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Serializes {@code Map<String, Object> as Map<String, String>}
 * where String value is JSON representation of the value
 */
public class StringMapSerializer implements JsonSerializer<Map> {
    @Override
    public JsonElement serialize(Map map, Type type, JsonSerializationContext jsonSerializationContext) {
        Map<String, JsonElement> stringMap = new HashMap<>(map.size());

        for (Object entry: map.entrySet()) {
            Map.Entry<String, Object> objectEntry = (Map.Entry<String, Object>) entry;

            String key = objectEntry.getKey();
            JsonElement value = jsonSerializationContext.serialize(objectEntry.getValue());

            stringMap.put(key, value);
        }

        return jsonSerializationContext.serialize(stringMap);
    }
}
