package TP2;

public class task1 {
    // Task  
// 1.  Write a JAVA program that: 
// a. Ask a user to enter his exam score using args input. 
// b. Display a "text mark" according to the entered score
public static void main(String [] args){
    if(args.length>0){
       int score=Integer.parseInt(args[0]);

       System.out.println(score);
       if (score >= 17 && score <= 20) {
        System.out.println("Excellent");
    } else if (score >= 15 && score < 17) {
        System.out.println("very well");
    } else if (score >= 13 && score < 15) {
        System.out.println("well");
    }  else if (score >= 10 && score < 13) {
        System.out.println("satisfaisant");
    } 
    else {
        System.out.println("Fail");
    }
    }
    else{
        System.out.println("please provide your exam score");
    }
}
}
