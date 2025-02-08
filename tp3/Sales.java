package tp3;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter  the number of sales people : ");
         int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum = 0;
      

        // Input sales for each salesperson
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("-----------------");

        // Display sales for each salesperson and calculate total sales
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" the sale of  person " + (i + 1) + ": " + sales[i]);
            sum += sales[i];
        }
        System.out.println("Total sales: " + sum);
        // print the average of sale
        int average = sum / 5;
        System.out.print ("the average is : " + average);
        // find the max and the min sale
        int max=0;
        int min=0;
        for (int i = 0; i < sales.length; i++) {
            max = sales[0];
            min = sales[0];
            if (sales[i] > max) {
                max = sales[i];

            }
            if (sales[i] < min) {
                min = sales[i];
            }

        }
        System.out.println("the max of sale  is : " + max + " and the min of sale  is : " + min);
        System.out.print("please enter a value to see which person have this value sale : ");
        int val=scan.nextInt();
        int n=0;
        for(int i=0;i<sales.length;i++){
            if(sales[i]==val){
                System.out.println("the player nember "+(i+1)+" is has the same value ");
                 n+=1;
            }
//the total number of salespeople whose sales exceeded the value entered. 
        }
        System.out.println(n==1?"":" the total number of salespeople whose sales exceeded the value entered is : " +n);
      System.out.println("--------------the end -----------------");
        scan.close();
    }
}
