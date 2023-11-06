package Arrays;

public class SubArray {
    public static void sub(int number[])
    {
        int currSum=0;
        for(int i=0;i<number.length;i++)
        {
            int start=i;
            for(int j=i;j<number.length;j++)
            {
                currSum=0;
                int end=j;
                    
             
                for(int k=start;k<=end;k++) //print
                {
                    
                    System.out.print(" "+ number[k]);
                    currSum+=number[k];
                  
                   
                     
                
                   
                 
                }
                  System.out.print(" sum is "+currSum);
               
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        sub(number);
    }
    
}
