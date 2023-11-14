package Sorting;
import java.util.*;
public class Counting {
    public static void counting(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            largest=Math.max(largest,numbers[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<numbers.length;i++)
        {
            count[numbers[i]]++;
        }
        
        int j=0;
        for(int i=0;i<numbers.length;i++)
        {
            while(count[i]>0)
            {
                numbers[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void print(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,4,1,3,2,4,3,7};
        counting(numbers);
        print(numbers);
        
    }
    
}
