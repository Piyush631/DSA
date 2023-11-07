public class SubArray {
    public static void sub(int number[])
    {
        int temp=0;
        int largest=Integer.MIN_VALUE;
        for(int i = 0; i < number.length; i++)
        {
            int start=i;
            for(int j=i;j<number.length;j++)
            {
                int end=j;
                for(int k=start; k<=end; k++)
                {
                    System.out.print(number[k]+" ");
                    temp=temp+number[k];
                    if(largest < temp)
                    {
                        largest=temp;
                    }
                    
                }
                System.out.println("Sum of array is"+temp);
                
            }
            System.out.println();
           
        }
        System.out.println("large of array is"+largest);
    }
    public static void main(String args[])
    {
        int number[]={2,4,6,8,10};
        sub(number);
    }
    
}
