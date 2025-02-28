package tp5;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    // task3
    public static void search_dup_return(ArrayList<String> list, String input, ArrayList<String> list1) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(input)) {
                list1.add(list.get(i));
            }

        }
        System.out.println("the new  array you looking for is :  " + list1);
    }

    // task2
    public static void search(ArrayList<String> list, String input) {

        if (list.contains(input)) {

            System.out.println("Element '" + input + "' found in the list.");
        } else {
            System.out.println("Element '" + input + "' not found in the list.");
        }

    }

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> array1 = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("do you went to add un elemnt :");
        String response = scan.next();

        while (response.equalsIgnoreCase("yes")) {
            System.out.println("--------------------------");
            System.out.println("enter un element :");
            String value = scan.next();
            array.add(value);

            System.out.println("------------------");
            System.out.println("the array : " + array);
            System.out.println("do you went to search for a value :");
            String resp = scan.next();
            if (resp.equalsIgnoreCase("yes")) {
                System.out.println("enter the value you went to search for :");
                String input = scan.next();
                search(array, input);
                search_dup_return(array, input, array1);
            }
            System.out.println("Do you want to add another element? (yes/no)");
            response = scan.next();
        }
        System.out.println("thank you ");
        scan.close();
    }

}
