package Arrays;
import java.util.*;

public class Practice {
    public static void run(int number[],int target)
    {
        for(int i=0;i<number.length;i++)
        {
            for(int j=i+1;j<number.length;j++)
            {
                if(number[i]+number[j]==target)
                {
                    System.out.println("("+i+", " +j+")");
                }
            }
        }
    }
    public static void main(String args[])
    {
         int number[]={2,3,7,15};
    int target=9;
run(number,target);
    }
   
      
        
    
}
