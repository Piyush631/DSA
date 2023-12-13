package ArrayList;

import java.util.*;

public class Swap {
    public static void swap(ArrayList<Integer>list2,int idx1,int idx2)
    {
        int temp=list2.get(idx1);
        list2.set(idx1,list2.get(idx2));
        list2.set(list2.get(idx2),temp);
    }
    public static void main(String[] args) {
         ArrayList<Integer>list2=new ArrayList<>();
         list2.add(2);
         list2.add(5);
         list2.add(9);
         list2.add(3);
         list2.add(6);
         int idx1=1;
         int idx2=3;
         System.out.println(list2);
         swap(list2,idx1,idx2);
         System.out.println(list2);

         Collections.sort(list2);
         System.out.println(list2);
         Collections.sort(list2,Collections.reverseOrder());
         System.out.println(list2);
        
    }
    
}
