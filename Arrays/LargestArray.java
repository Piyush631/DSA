package Arrays;

public class LargestArray {
    public static int Large(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(largest < numbers[i])
            {
                largest=numbers[i];
            }
             if(smallest > numbers[i])
            {
                smallest=numbers[i];
            }
          
        }  System.out.println("smallest value is " + smallest);

        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={6,3,5,8,12,34,56,2,4};
        System.out.println("largest number is "+ Large(numbers));
        
    }
    
}
