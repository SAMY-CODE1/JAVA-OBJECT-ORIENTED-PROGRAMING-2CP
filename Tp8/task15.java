package Tp8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class task15 {
    public static <T> List<T> removDup(List<T> list) {
        Set<T> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 6, 7);
        System.out.println("Original List: " + intList);

        List<Integer> uniqueIntList = removDup(intList);
        System.out.println("List after removing duplicates: " + uniqueIntList);

    }
}
