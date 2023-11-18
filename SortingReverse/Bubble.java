package SortingReverse;

public class Bubble {
    public static void sort(int number[])
    {
        int temp=0;
        for(int i=0;i<number.length-1;i++)
        {
            for(int j=0;j<number.length-i-1;j++)
            {
                if(number[j]<number[j+1])
                {
                     temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                    
                }
            }
        }
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
    }
    public static void main(String[] args) {
        int number[]={5,2,3,4,1};
        sort(number);
    }
    
}
