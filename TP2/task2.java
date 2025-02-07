package TP2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number n :");
        int n=scan.nextInt();
        int i=1;
        double res=0;
        while (i<=n) {
        res+= 1.0/i;
        i++;
        }
        System.out.printf( "the result is :  %.2f ",res);
        scan.close();
    }
}
