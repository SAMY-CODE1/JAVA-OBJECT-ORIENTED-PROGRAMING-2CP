package tp4;

import java.util.Scanner;

public class CreatObj {
    int conter;

    public CreatObj() {
        conter++;
        System.out.println("an object have been created");
    }

    public static void main(String[] args) {
        boolean continu = true;
        Scanner scan = new Scanner(System.in);
        while (continu == true) {

         
            System.out.println("do you went to creart an instance y/n : ");
            String response = scan.next();
            if (response.equalsIgnoreCase("y")) {
                CreatObj obj = new CreatObj();
                System.out.println("number of created instance is : " + obj.conter);
            } else {
                continu = false;
            }

           
        }
        System.out.println("thank you ...");
        scan.close();
    }
}
