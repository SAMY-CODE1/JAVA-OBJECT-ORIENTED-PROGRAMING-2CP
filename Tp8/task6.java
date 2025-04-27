package Tp8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task6 {
    public static <T> List<T> test(List<T> list, Predicate<T> predicate) {
        List<T> filterdList = new ArrayList<>();
        for (T ele : list) {
            if (predicate.test(ele)) {
                filterdList.add(ele);
            }
        }
        return filterdList;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 22, 3, 40, 11, 13, 17);
        List<Integer> filterdList = test(list, n -> n % 2 == 0);
        System.out.println("the normal list :" + list);
        System.out.println("the filterd list is (just even numbers)  : " + filterdList);
    }
}
