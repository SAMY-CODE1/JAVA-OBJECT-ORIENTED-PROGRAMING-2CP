package tp3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class task4 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("enter a string : ");
    String str = scan.next();
    // convert the string to an array of char
    char[] Arr = str.toCharArray();
    // dispaly the array
    System.out.println(Arr.length);
    String arrChar = Arrays.toString(Arr);
    System.out.println(arrChar);

    int len = Arr.length ;
    for (int i = 0; i < len/2; i++) {
      char temp = Arr[i];
      Arr[i] = Arr[len -1-i];
      Arr[len - 1 - i] = temp;
    }
    // char[] Arr2 = new char[Arr.length];
    // for (int i = 0; i < Arr.length; i++) {
    // Arr2[i] = Arr[Arr.length - 1 - i];
    // }
    // System.out.println(Arrays.toString(Arr2));
    String converStr = new String(Arr);
    System.out.println("the convert setring " + str + " is : " + converStr);
    scan.close();
  }
}
