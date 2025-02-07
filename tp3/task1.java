package tp3;

import java.util.Scanner;

public class task1 {
    //methode1
 public static int power5(int x){
    return (int) Math.pow( x , 5);
 }
 //methode2
 public static int prodsum (int a,int b){
    return (a*b)-(a+b);
 }
 //methode3
 public static int  prod3(int[] arr){
if (arr.length == 3){
return arr[0]*arr[1]*arr[2];
}else {
    throw new IllegalArgumentException("Array must have exactly 3 elements.");
}
 }
 public static void main(String []args){
  boolean continu=true;
  Scanner scan=new Scanner(System.in);  
while ( continu) {
System.out.println("-----------------------------");

System.out.println("1. The power of 5 of an integer given as a parameter. \r\n" + //
        "2. The product of two integers given as a parameter minus their sum.  \r\n" + //
        "3. The product of three integers given as an integer Array parameter. ");
        System.out.println("-----------------------------");
        System.out.print("chose one of this methods : ");
        int val=scan.nextInt();
        switch (val) {
            case 1:
            System.out.println("-----------------------------");
            System.out.println("please enter a number :");
            int number=scan.nextInt();
            int num5=power5(number);
            System.out.println("the pawer 5 of "+number+" is: "+num5);
            System.out.println("");
            System.out.println("----------------------");
                break;
                case 2:
                System.out.println("-----------------------------");
                System.out.println("the product of two number muinus thier sum");
                System.out.print("enter the first number : ");
                int num1=scan.nextInt();
                System.out.print("enter the second number : ");
                int num2=scan.nextInt();
                int res=prodsum(num1, num2);
                System.out.println("the result is  : "+res);
                System.out.println("-----------------------------");
                
                break;
                case 3:
                System.out.println("-----------------------------");
                //creat array of size 3
                System.out.println("calculate the product of an array of 3 element");
                int[] numbers=new int [3];
                //fill the  array
                for(int i=0;i<3;i++){
                    System.out.println("enter the "+(i+1)+"number : ");
                    numbers[i]=scan.nextInt();
                }
                int result=prod3(numbers);
                System.out.println("the result is : "+result);
                System.out.println("-----------------------------");
                break;
                default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
        System.out.println("do you went to continu write(yes/no)! ");
        String response=scan.next();
        if(response.equalsIgnoreCase("yes")){
            continu=true;
        }else{
            continu=false;
        }
    


 }
 scan.close();
}
}
