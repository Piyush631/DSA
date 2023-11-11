package Sorting;

public class Selection {
    public static void sort(int number[])
    {
        for(int i=0;i<number.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<number.length;j++)
            {
                if(number[minPos] > number[j])
                {
                    minPos=j;
                }
                 
            }
           int temp=number[minPos];
            number[minPos]=number[i];
            number[i]=temp;
        }
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
    }
    public static void main(String[] args) {
        int number[]={5,4,1,2,3};
        sort(number);
    }
    
    
}
