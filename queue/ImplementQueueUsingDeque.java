package queue;
import java.util.*;

public class ImplementQueueUsingDeque {
    static class Queue{

    
    Deque <Integer> dd=new LinkedList<>();
    public  void add(int data)
    {
        dd.addFirst(data);
    }
    public int remove()
    {
        return dd.removeLast();
    }
    public int peek()
    {
        return dd.getLast();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        
    }
    
}
