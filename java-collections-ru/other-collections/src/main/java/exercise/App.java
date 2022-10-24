package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static LinkedHashMap<String, Object> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, Object> result = new LinkedHashMap<>();
        for (Map.Entry<String, Object> data: data2.entrySet()) {
            String key = data.getKey();
            if (data1.containsKey(key)) {
                if (data1.get(key).equals(data2.get(key))) {
                    result.put(key, "unchanged");
                } else {
                    result.put(key, "changed");
                }
            } else {
                result.put(key, "added");
            }
        }
        for (Map.Entry<String, Object> data: data1.entrySet()) {
            String key = data.getKey();
            if (!data2.containsKey(key)) {
                result.put(key, "deleted");
            }
        }
        return (LinkedHashMap<String, Object>) result;
    }
}
//END
