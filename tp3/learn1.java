package tp3;

public class learn1 {
    public static void main(String[]args){
        String str1=new String("samyboutalbi");
       String st="moha";
System.out.println("the char in 1 index is :"+str1.charAt(1));
System.out.println("the lenth is :"+str1.length());
System.out.println("my string is:"+str1.substring(2, 7));
System.out.println("is empty:" +str1.isEmpty());
System.out.println("concate the two str :"+str1.concat("  salo " ));
System.out.println("replace a whith z:"+str1.replace("a","z"));
System.out.println(str1.repeat(1));
System.out.println("index of "+str1.indexOf("a"));
    }
}
