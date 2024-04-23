package Array;

import java.util.HashMap;
import java.util.Map;

public class JsonToMapExample {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Map<String, Object> jsonMap = parseJson(jsonString);
        // Print the Map
        System.out.println(jsonMap);
    }

    public static Map<String, Object> parseJson(String json) {
        Map<String, Object> resultMap = new HashMap<>();
        String[] tokens = json.split("[{},:\"]");
        String key = null;
        boolean isKey = true;
        for (String token : tokens) {
            if (token.trim().isEmpty()) {
                continue;
            }
            if (isKey) {
                key = token;
            } else {
                resultMap.put(key, token);
            }
            isKey = !isKey;
        }
        return resultMap;
    }
}

