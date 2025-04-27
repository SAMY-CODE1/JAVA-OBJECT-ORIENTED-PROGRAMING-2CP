package Tp8;

import java.util.*;

public class task18 {

    public static <T> void copyList(List<T> source, List<T> destination) {

        Collections.copy(destination, source);
    }

    public static void main(String[] args) {

        List<String> sourceList = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        System.out.println("Source List: " + sourceList);

        List<String> destinationList = new ArrayList<>(Arrays.asList("", "", "", ""));
        System.out.println("Destination List before copy: " + destinationList);

        copyList(sourceList, destinationList);

        System.out.println("Destination List after copy: " + destinationList);
    }
}
