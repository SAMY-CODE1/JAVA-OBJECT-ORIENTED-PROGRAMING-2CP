package Tp8;
import java.util.HashMap;
import java.util.Map;
public class task7 {


    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
       
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Alice");
        studentMap.put(2, "Bob");
        studentMap.put(3, "Charlie");

        System.out.println("Student Map:");
        printMap(studentMap);

        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Apple", 1.99);
        productPrices.put("Banana", 0.99);
        productPrices.put("Orange", 2.49);

        System.out.println("\nProduct Prices:");
        printMap(productPrices);
    }
}


