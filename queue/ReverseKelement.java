package queue;

import java.util.*;

public class ReverseKelement {
    public static void reverse(Deque<Integer>q,int k)
    {
             Stack<Integer>s=new Stack<>();
             for(int i=0;i<k;i++)
             {
                s.push(q.removeFirst());
             }
             while(!s.isEmpty())
             {
                q.addLast(s.pop());
             }
    }
    public static void main(String[] args) {
        Deque<Integer>q=new LinkedList<>();
   
       q.addFirst(10);
       q.addFirst(20);
       q.addFirst(30);
       q.addFirst(40);
       q.addFirst(50);
       q.addFirst(60);
       q.addFirst(70);
       q.addFirst(80);
       q.addFirst(90);
       q.addFirst(100);
      
       reverse(q, 5);
       while(!q.isEmpty())
       {
        System.out.print(q.getFirst()+" ");
        q.removeFirst();
       }

      
    }
    
}
