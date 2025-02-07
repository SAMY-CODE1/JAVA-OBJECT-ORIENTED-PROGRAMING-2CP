package tp3;

import java.util.Scanner;

public class task2 {
    public static class Player {
String name;
int tshirtN;    
        //constracteur
        public Player(String name,int tshirtN){
            this.name=name;
            this.tshirtN=tshirtN;
        }
        
        public static void main(String[]args){
          
        
          //creat the array of student
          Player[] player=new Player[9];
          //initilase student
          player[0] = new Player("courtios",1);
          player[1] = new Player("Dani ",2);
          player[2] = new Player("Alaba",4);
          player[3] = new Player("Nacho",6);
          player[4] = new Player("gonzalo ",33);
          player[5] = new Player("kroose",8);
          player[6] = new Player("bilingham",5);
          player[7] = new Player("rodrigu",11);
          player[8] = new Player("vinisus",7);
///////////
 Scanner scan=new Scanner(System.in);
          System.out.print("enter the number of the player :");
          int val=scan.nextInt();
         
          
for (Player play: player){
    if(play.tshirtN==val){
        System.out.println("the name of the player is : "+play.name);
    }
}
    scan.close();
        }
       
    }
}
