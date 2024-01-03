package Greedy;

import java.util.Arrays;
import java.util.*;
import java.util.Comparator;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        int v=590;
        int count=0;
       Arrays.sort(coins,Comparator.reverseOrder());
       ArrayList<Integer>l=new ArrayList<>();
       for(int i=0;i<coins.length;i++)

       {
        if(v >= coins[i])
        {
            while(v>=coins[i])
            {
                count++;
                v-=coins[i];
            l.add(coins[i]);

            }
        }
       }
       System.out.println(count);
       for(int i=0;i<l.size();i++)
       {
        System.out.println(l.get(i)+" ");
       }
        
    }
    
}
