import java.util.*;
public class Basic {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int marks[]=new int[50];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        System.out.println("maths marks is"+marks[0]);
        System.out.println("hindi marks is"+marks[1]);
        //update
        marks[1]=marks[1]+20;
        System.out.println("hindi marks is"+marks[1]);
        int percent=(marks[0]+marks[1])/2;
        System.out.println("percent is"+percent);
        //length of array
        System.out.println("length of array"+ marks.length);
    }
    
}
