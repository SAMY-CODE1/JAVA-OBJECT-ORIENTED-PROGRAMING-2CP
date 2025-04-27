package Tp8;

import java.util.HashSet;
import java.util.Set;

public class task9 {
    public static <T> Set<T> findInser(Set<T> set1, Set<T> set2) {

        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;

    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(6);
        Set<Integer> intersection = findInser(set1, set2);
        System.out.println("the intersection bettween set 1 and set2 is : " + intersection);
    }
}
