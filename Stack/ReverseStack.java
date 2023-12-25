package Stack;
import java.util.*;

public class ReverseStack {
    public static void stackReverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        stackReverse(s);
        pushAtBottom(s,top);
    }
    public static void pushAtBottom(Stack<Integer>s,int top)
    {
        if(s.isEmpty())
        {
            s.push(top);
            return;
        }
        int data=s.pop();
        pushAtBottom(s,top);
        s.push(data);
    }
    public static void printstack(Stack<Integer>s)
    {
        while(!s.isEmpty()){
         
          System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
      
        stackReverse(s);
        printstack(s);
    }
    
}
