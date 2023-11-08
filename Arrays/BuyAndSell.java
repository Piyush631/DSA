package Arrays;
import java.util.*;

public class BuyAndSell {
    public static int buy(int prices[])
    {
        int max=0;
        int buying=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buying < prices[i])
            {
                profit=prices[i]-buying;
                 max=Math.max(max,profit);
            }
            else{
                buying=prices[i];
            }
         
           
            
        }
       return max;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
       System.out.println(buy(prices));
        
    }
    
}
