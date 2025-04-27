package Tp8;
import java.util.List;

public class task3 {
    public static <T> Integer Occu(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (target.equals(list.get(i))) {
                return i;

            }
            System.out.println("the index of the first  occunce  is :" + i);
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(10, 20, 30, 40);
        System.out.println("the index of 20 is :" + Occu(list1, 20));
    }
}
