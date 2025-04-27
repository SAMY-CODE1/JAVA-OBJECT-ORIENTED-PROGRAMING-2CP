package Tp8;
import java.util.ArrayList;
import java.util.List;

public class task14 {

   
    public static <T extends Comparable<T>> List<T> compareLists(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        
     
        int size = Math.min(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            T element1 = list1.get(i);
            T element2 = list2.get(i);
            if (element1.compareTo(element2) > 0) {
                result.add(element1); 
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(5, 3, 8, 1, 7);
        List<Integer> list2 = List.of(3, 6, 4, 2, 5);
        
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        
        List<Integer> result = compareLists(list1, list2);
        System.out.println("Elements in List 1 greater than in List 2: " + result);

        
    }
}
