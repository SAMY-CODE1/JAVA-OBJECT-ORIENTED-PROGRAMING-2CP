package tp3;

import java.util.Scanner;

public class task3 {
    // Write a java method that checks if an email ends with “@esi-sba.dz”. 
    public static boolean isEnd(String email){
        return email.endsWith("@esi-sba.dz");

    }
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        System.out.println("please enter you email : ");
        String emailString=scan.nextLine();
   System.out.printf(isEnd(emailString)?"The email is valid":"ionvalide email");
        scan.close();
    }
}
