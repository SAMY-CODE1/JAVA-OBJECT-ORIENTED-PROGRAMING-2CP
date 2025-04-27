package Tp8;
import java.util.*;
public class task17 {
    public static <T> List<T> rotat(List<T> list,int distance){
        List<T> rotateList = new ArrayList<>(list); 
        Collections.rotate(rotateList, distance);   
        return rotateList;   
    }
    public static void main(String[] args) {
           List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Original Integer List: " + intList);

        List<Integer> rotatedIntList = rotat(intList, 3);
        System.out.println("Rotated Integer List (distance 3): " + rotatedIntList);

    }
}
