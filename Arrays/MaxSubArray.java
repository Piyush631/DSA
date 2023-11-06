package Arrays;

public class MaxSubArray {
    public static void max(int number[])
    {
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            int start=i;
            for(int j=i;j<number.length;j++)
            {
                curr=0;
                int last=j;
                for(int k=start;k<=last;k++)
                {
                    curr +=number[k];
                }

            }
            System.out.println("sum  is "+curr);
            if(max < curr)
            {
                max=curr;
            }
        }
        System.out.println("max of number is "+max);
            
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        int number2[]={2,-1,-6,-2,3};
        max(number);
        max(number2);
        
    }
    
}
