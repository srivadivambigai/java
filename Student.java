// import java.lang.classfile.instruction.ThrowInstruction;
// import java.lang.classfile.Signature;
import java.util.Scanner;
public class Student{
    int m1,m2,m3,m4,m5;
    int total;
    double a;
    // private Object[] d;
    double d;
    public Student(int m1,int m2,int m3, int m4,int m5){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
 }
 public void  tot(){
     total=m1+m2+m3+m4+m5;
    // return total;
 }
 public void avg(){
        a = total;
        d=a/5.0;
    // return d;
 }
// @SuppressWarnings("ConvertToTryWithResources")
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the mark1:");
    int m1=sc.nextInt();
    System.out.println("enter the mark2:");
    int m2=sc.nextInt();
    System.out.println("enter the mark3:");
    int m3=sc.nextInt();
    System.out.println("enter the mark4:");
    int m4=sc.nextInt();
    System.out.println("enter the mark5:");
    int m5=sc.nextInt();
    Student s=new Student(m1,m2,m3,m4,m5);
    s.tot();
    s.avg();
    System.out.println("the total of marks"+s.total);
    System.out.printf("the average of 5 marks:%.2f ",s.d);
     }

 }
