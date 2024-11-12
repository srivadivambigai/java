//queston:The Haunted House
// You are trapped in a haunted house!
//  Write a program that asks the user to enter a number of rooms (1 to 10). 
//  For each room, randomly determine if it contains a ghost (yes or no). 
//  The program should tell the user how many rooms had ghosts, and if they survived the night (if they encounter more than 3 ghosts, they don't!).
import java.util.Scanner;
public class HauntedHouse{
    int x;
    int y=0;
    // int z=0;
    public HauntedHouse(int x){
       
            this.x=x;
        
    }

    public HauntedHouse() {
    }
    public int choose(){
        switch (x) {
            case 1,2,3 -> {
                System.out.println("omg , you are killed by ghost ");
                    y=1;
            }
            case 4,5,6,7,8,9,10 -> {
                System.out.println("you are escaped from ghost ");
                    y=0;
            }
            default -> {
                System.out.println("choices should be between 1 to 10 ");
                }
            
        }
        
        return y;
        }
public static void main(String[] args) {
    int g=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("number of rooms your using ");
    int room =sc.nextInt();
    if (room<1 || room>10){
     System.out.println("enter correct number of rooms , it should be between 1 to 10");
    }
    for (int i=0;i<room;i++){
        System.out.println("enter you choice");
        int x=sc.nextInt();
        HauntedHouse h=new HauntedHouse(x);
        h.choose();
        if (h.y==1)
        {  
            System.out.println("your lifeline reduced");
            g++;
            }
        if (g==3){
            System.out.println("you are not survived ");
            break;
        }
            
         if(h.y==0){
            System.out.println("you have another chance");
        }
        
    }
    if (g<3){
    System.out.println("you have survived from the ghosty night 👻👻 ");}
    
}}
    
