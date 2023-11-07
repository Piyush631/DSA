package Arrays;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        int marks[]=new int[3];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
       
        System.out.println("physics marks "+marks[0]);
        System.out.println("Maths marks "+marks[1]);
        System.out.println("Maths marks "+marks[2]);
        System.out.println("length is "+marks.length);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }



    }
    
}
