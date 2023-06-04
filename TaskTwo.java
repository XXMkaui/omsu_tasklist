import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    public static <K, V> Map<V, K> invertMap(Map<K, V> resultMap) {
        Map<V, K> updMap = new HashMap<>();
        for (Map.Entry<K, V> entry : resultMap.entrySet()) {
            updMap.put(entry.getValue(), entry.getKey());
        }
        return updMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("Q", 5);
        resultMap.put("W", 10);
        resultMap.put("E", 15);
        resultMap.put("R", 20);
        resultMap.put("T", 25);
        resultMap.put("Y", 30);
        Map<Integer, String> updMap = invertMap(resultMap);
        for (Map.Entry<Integer, String> entry : updMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}