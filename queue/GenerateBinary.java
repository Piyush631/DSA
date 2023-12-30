package queue;
import java.util.*;

public class GenerateBinary {
    public static void generate(Queue<Integer>q,int data)
    {
    
        for(int i=1;i<=data;i++)
        {
            int mynum=i;
            int pow=0;
            int bin=0;
            while(mynum>0)
            {
                int rem=mynum%2;
                bin=bin+(rem *(int)(Math.pow(10,pow)));
                pow++;
                mynum=mynum/2;
            }
            q.add(bin);
        }
    }
      
    
    public static void main(String[] args) {
            Queue <Integer>q=new LinkedList<>();
        generate(q,5);
        while(!q.isEmpty())
        {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    
    }
    
}
