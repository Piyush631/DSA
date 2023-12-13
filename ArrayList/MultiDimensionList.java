package ArrayList;
import java.util.*;

public class MultiDimensionList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        mainlist.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=0;i<4;i++)
        {
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.print(mainlist);
        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> curr=mainlist.get(i);
            for(int j=0;j<curr.size();j++)
            {
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
    
}
