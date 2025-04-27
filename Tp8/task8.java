package Tp8;

import java.util.HashSet;
import java.util.Set;

public class task8 {
    public static <T> Set<T> Union(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        Set<Integer> unionSet = Union(setA, setB);
        System.out.println("the union og the set A abd B" + unionSet);
    }
}
