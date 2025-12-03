package WiproTraining.oops;
import java.util.*;
class Student{
    int id;
    String name;
    int marks;
    Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
}
public class Basic {
    public static void main(String[] args) {
        Student[] s=new Student[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            
        }
//        String[] student=new String[5];
//        for(int i=0;i<5;i++){
//            student[i]=sc.next();
//        }
//        int[] marks=new int[5];
//        for(int i=0;i<5;i++){
//            marks[i]=sc.nextInt();
//        }
//        int[] id=new int[5];
//        for(int i=0;i<5;i++){
//            id[i]=sc.nextInt();
//        }
//
//        int topper=Integer.MIN_VALUE;
//        for(int i=0;i<5;i++){
//            if(topper<marks[i]){
//                topper=Math.max(topper,marks[i]);
//            }
//        }
//        System.out.println(topper);
    }
}
