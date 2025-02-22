package TP2;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your credit : ");
        int credit = scan.nextInt();
        boolean reset = false;
        while (reset == false) {
            System.out.println("welcom to IMTIYAZ\r\n" + //
                    " 4: 190DA= 1000DA Tous + 3Go / 24\r\n" + //
                    " 44: 1500Da=Ilimite Djezzy+3000DA+40Go/30jrs\r\n" + //
                    " 45:1200Da=Ilimite Djezzy+2500DA+30jrs\r\n" + //
                    " 46:1000Da=ilimite Djezzy+3000DA+20Go/30jrs\r\n" + //
                    " 41:Parametres\r\n" + //
                    " 0:retour");
            System.out.println("choose your option :");
            int option = scan.nextInt();
            switch (option) {
                case 4:
                    if (credit >= 190) {
                        System.out.println("you have get 190DA= 1000DA Tous + 3Go / 24");
                        System.out.println("its left in you card :" + (credit - 190) + " DA");
                        reset = true;
                    } else {
                        System.out.println("you dont have enough credit");
                    }

                    break;
                case 44:
                    if (credit >= 1500) {
                        System.out.println("you have get 190DA= 1000DA Tous + 3Go / 24");
                        System.out.println("its left in you card :" + (credit - 1500) + " DA");
                        reset = true;
                    } else {
                        System.out.println("you dont have enough credit");
                    }
                    break;
                case 45:
                    if (credit >= 1200) {
                        System.out.println("you have get 190DA= 1000DA Tous + 3Go / 24");
                        System.out.println("its left in you card :" + (credit - 1200) + " DA");
                        reset = true;
                    } else {
                        System.out.println("you dont have enough credit");
                    }
                    break;
                case 46:
                    if (credit >= 1000) {
                        System.out.println("you have get 190DA= 1000DA Tous + 3Go / 24");
                        System.out.println("its left in you card :" + (credit - 1000) + " DA");
                        reset = true;
                    } else {
                        System.out.println("you dont have enough credit");
                    }

                    break;
                case 41:

                    break;
                case 0:
                    reset = false;

                    break;
                default:
                    System.out.println("please try again");
                    break;
            }
        }
        scan.close();
    }
}
