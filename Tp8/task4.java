package Tp8;
import java.util.ArrayList;
import java.util.List;
public class task4 {
    public static <T> List<T> rev(List<T> list){

        List<T> rev=new ArrayList<>();
        for (int i=list.size()-1;i>=0;i--){
            rev.add(list.get(i));
        }
        return rev;
    }
    public static void main(String[] args){
        List<Integer> list =new ArrayList<>(); 
        list .add(10);
        list .add(20);
        list .add(30);
        list .add(40);
        System.out.println("oreginal list : "+list);
        List<Integer> revlist=rev(list);
        System.out.println("the revessed list is :"+revlist);

    }

}
