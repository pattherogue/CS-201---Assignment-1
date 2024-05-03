import java.util.Map;
import java.util.TreeMap;

public class HashMapSort {
    public static Map<String, String> sortHashMapByKey(Map<String, String> unsortedMap) {
        // Use TreeMap directly to sort the map
        return new TreeMap<>(unsortedMap);
    }
}
