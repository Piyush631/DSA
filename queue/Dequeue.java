package queue;
import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        Deque <Integer> de=new LinkedList<>();
        de.addFirst(1);
        de.addFirst(2);
        de.addLast(3);
        de.addLast(4);
        System.out.println(de);
        de.removeFirst();
        System.out.println(de);
        System.out.println("first element is "+ de.getFirst());
        System.out.println("last element is "+ de.getLast());
        
    }
}
