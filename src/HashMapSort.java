import java.util.Map;
import java.util.TreeMap;

public class HashMapSort {
    // Method to sort a HashMap by key using TreeMap
    public static Map<String, String> sortHashMapByKey(Map<String, String> unsortedMap) {
        // Create a TreeMap to store the sorted entries
        TreeMap<String, String> sortedMap = new TreeMap<>(unsortedMap);
        return sortedMap;
    }
}
