package ArrayList;
import java.util.*;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(2);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                
                max=list.get(i);
            }
        }
        System.out.println("largest is " +max);
    }
    
}
