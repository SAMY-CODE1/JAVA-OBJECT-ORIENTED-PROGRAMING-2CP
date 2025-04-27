package Tp8;
import java.util.ArrayList;
import java.util.List;

public class task5 {
    public static <T> List<T> Merg(List<T> list1, List<T> list2) {
        List<T> mergList = new ArrayList<>();
        for (T ele : list1) {
            mergList.add(ele);
        }
        for (T ele : list2) {
            mergList.add(ele);
        }
        return mergList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("this is list 1 : " +list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        System.out.println("this is list 2 : " +list2);
        List<Integer> mergList=Merg(list1, list2);
        System.out.println("the merg list is :"+mergList);
    }
}
