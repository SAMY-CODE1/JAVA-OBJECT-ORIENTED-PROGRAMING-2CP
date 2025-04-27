package Tp8;
import java.util.*;
public class task12 {


    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null; 
        }
        
        T max = list.get(0); 
        
   
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element; 
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        
        List<Integer> intList = Arrays.asList(10, 20, 30, 50, 40);
        Integer maxInt = findMax(intList);
        System.out.println("Maximum Integer: " + maxInt);

        List<String> strList = Arrays.asList("apple", "orange", "banana", "grape");
        String maxStr = findMax(strList);
        System.out.println("Maximum String: " + maxStr);
    }
}

