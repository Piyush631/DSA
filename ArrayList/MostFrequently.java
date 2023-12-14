package ArrayList;

import java.util.ArrayList;

public class MostFrequently {
    public static int check(ArrayList<Integer>list,int target)
    {
        int result[]=new int[1000];
        for(int i=0;i < list.size()-1;i++)
        {
            if(list.get(i)==target)
            {
                result[list.get(i+1)]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<1000;i++)
        {
            if(max < result[i])
            {
                max=result[i];
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(10);
        list.add(300);
        System.out.println(list);
        System.out.println(check(list, 2));
    }
    
}
