package Tp8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task20 {
    public static <T> void fill(List<T> list, T value) {
        Collections.fill(list, value);

    }

    public static void main(String[] args) {
  List<Integer> intList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        System.out.println("Integer List before fill: " + intList);

        fill(intList, 5);
        System.out.println("Integer List after fill: " + intList);

    }
}
