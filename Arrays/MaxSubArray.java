public class MaxSubArray {
    
        public static void submax(int number[])
        {
            int temp=0;
            int largest=Integer.MIN_VALUE;
            for(int i = 0; i < number.length; i++)
            {
                int start=i;
                for(int j=i;j<number.length;j++)
                {
                    int end=j;
                     temp=0;
                    for(int k=start; k<=end; k++)
                    {
                        temp=temp+number[k];
                        
                       
                        
                        
                    }

                    System.out.println("Sum of array is"+temp);
                    if(largest < temp)
                    {
                        largest=temp;
                    }
                    
                }
               
            }
           System.out.println("large is"+largest);
        }
        public static void main(String args[])
        {
            int number[]={1,-2,6,-1,3};
            submax(number);
        }
        
    }
    
    

