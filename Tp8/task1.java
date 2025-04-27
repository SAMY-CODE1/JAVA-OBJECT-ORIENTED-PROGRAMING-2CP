package Tp8;

public class task1 {
    public static <T> boolean areArraysEquel(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 1; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
Integer []arr1={1,2,3,4};
Integer []arr2={1,2,3,4};
Integer []arr3={1,2,5,4};
System.out.println("array 1 and 2 are equel : "+areArraysEquel(arr1,arr2 ));
System.out.println( "array 2 and 3 are equel :"+areArraysEquel(arr2,arr3));
System.out.println("--------------------------------");
String [] arr11={"hello","samy"};
String [] arr22={"hello","samy"};
String [] arr33={"hel","samy"};
System.out.println("array 1 and 2 are equel : "+areArraysEquel(arr11,arr22 ));
System.out.println( "array 2 and 3 are equel :"+areArraysEquel(arr22,arr33));

    }
}