// question:The Lost Treasure Map
// A pirate has lost his treasure map! Write a program that takes the coordinates of two points on a map (x1, y1) and (x2, y2) and 
// calculates the distance between them. 
// The pirate needs this to find his treasure before the rival pirates do!
import java.util.Scanner;

 public class Treasure{
     int x1;
     int y1;
     int x2;
     int y2;
     public Treasure( int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
     }

    // private Treasure() {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
     public int add(){
       int   x3=x1-x2;
      //   @SuppressWarnings("unused")
         int  y3=y1-y2;
         int r=x3*x3+y3*y3;
         return r;
     }
     public double root(){
         int rot=add();
         double root=Math.sqrt(rot);
         return  root;

     }

     @SuppressWarnings("ConvertToTryWithResources")
     public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter x1:");
    int x1=sc.nextInt();
     System.out.println("enter y1:");
    int y1=sc.nextInt();
     System.out.println("enter x2:");
    int x2=sc.nextInt();
     System.out.println("enter y2:");
    int y2=sc.nextInt();
    Treasure t=new Treasure(x1,y1,x2,y2);
    t.add();
    double h=t.root();
    // DecimalFormat df = new DecimalFormat("#.00"); // Two decimal places

    System.out.printf("the shortest distance %.2f :%n",h);
    sc.close();
}}