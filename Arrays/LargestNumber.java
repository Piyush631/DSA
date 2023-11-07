public class LargestNumber {
    public static int larg(int number[])
    {
        int largest=Integer.MIN_VALUE;
       
        for(int i=0;i<number.length;i++)
        {
            if(largest < number[i])
            {
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String args[])
    {
        int number[]={3,6,4,7,9,4,5};
        int res=larg(number);
        System.out.print("largest number is "+res);
    }
    
}
