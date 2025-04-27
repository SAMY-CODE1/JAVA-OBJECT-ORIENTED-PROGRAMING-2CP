package Tp8;

import java.util.*;

public class task19 {
    public static <T extends Comparable<T>> void findMinMax(List<T> list) {
  
  T min =Collections.min(list);
  T max =Collections.max(list);
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
    public static void main(String[] args) {
     
        List<Integer> intList = Arrays.asList(4, 1, 9, 3, 7, 2);
        System.out.println("Integer List: " + intList);
        findMinMax(intList);

    }
}