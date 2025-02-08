package tp3;

import java.util.Scanner;

public class task5 {
    // creat a recurtion mathode to reverse a string
    public static String Reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return Reverse(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = scan.next();
        String reversdString = Reverse(str);
        System.out.println("the re versed string of the string" + str + "is: " + reversdString);
        scan.close();
    }

}
