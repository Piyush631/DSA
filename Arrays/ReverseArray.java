public class ReverseArray {
    public static void rev(int number[])
    {
        int start=0;
        int end=number.length-1;
        
        while(start<end)
        {
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;
            start++;
            end --;

        }
    }
    public static void main(String args[])
    {
        int number []={3,6,77,876,45,34,36};
        rev(number);
        for(int i =0;i<number.length;i++)
        {
            System.out.print(" " +number[i]);
        }
        System.out.println();
    }
   
}
