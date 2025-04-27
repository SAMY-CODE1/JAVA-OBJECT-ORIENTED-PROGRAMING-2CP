package Tp8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class task13 {
  



    // Generic method to sort a list of Comparable elements
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
     
        List<Integer> intList = new ArrayList<>(List.of(5, 3, 8, 1, 2));
        System.out.println("Before sorting: " + intList);
        sortList(intList);
        System.out.println("After sorting: " + intList);

    }
}


