package Tp8;
import java.util.*;
public class task16 {
   



    public static <T> List<T> shuffleList(List<T> list) {
    
        List<T> shuffledList = new ArrayList<>(list);
    
        Collections.shuffle(shuffledList);

        return shuffledList;
    }

    public static void main(String[] args) {
       
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Original Integer List: " + intList);

        List<Integer> shuffledIntList = shuffleList(intList);
        System.out.println("Shuffled Integer List: " + shuffledIntList);

       
    }


}
