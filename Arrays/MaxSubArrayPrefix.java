package Arrays;

public class MaxSubArrayPrefix {
    


public static void sub(int number[])
    {
        int currSum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        //calculate prefix
        for(int i=1;i<number.length;i++)
        {
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++)
        {
            int start=i;
            for(int j=i;j<number.length;j++)
            {
                currSum=0;
                int end=j;
                currSum=start==0 ?prefix[end]:prefix[end]-prefix[start-1];
                if(max < currSum)
                {
                    max=currSum;
                }
            }

             
              
                  
        }
        System.out.println("Max of sum is " +max);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        sub(number);
    }
}