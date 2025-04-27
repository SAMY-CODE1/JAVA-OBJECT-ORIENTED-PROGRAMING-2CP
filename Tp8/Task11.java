package Tp8;

 import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task11 {  
    public static <K, V> List<K> key(HashMap<K, V> map, V value) {
        List<K> keys = new ArrayList<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }

        return keys;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 25);
        map.put("David", 35);

        // Value to search for
        Integer valueToFind = 25;

        List<String> keys = key(map, valueToFind);

        System.out.println("Keys with value " + valueToFind + ": " + keys);
    }
}
