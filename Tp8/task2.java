package Tp8;
import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static <T extends Number> void Sum(List<T> numbers) {

        int sumEven = 0;
        int sumOdd = 0;
        for (T num : numbers) {
            int val = num.intValue();
            if (val % 2 == 0) {
                sumEven += val;
            } else {
                sumOdd += val;
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(15);
        intList.add(20);
        intList.add(25);
        intList.add(30);
        Sum(intList);
    }
}
