package tp1;

public class task5 {
    public static void main(String[] args){
        int i=10;
        int n =++i % 5;
        System.out.println(i) ;  //11      ;
        System.out.println(n);//0 the value of i=10 assigned to  to n 
        //its take the original value of i because its used firt 
        // but in the state od n=++i its increment the value if i before its used so its mean that 
        // the code is executed char by char
    }
}
//3_ we use ! to invert the value of za boolean we use == to compaire 

