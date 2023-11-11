package Sorting;

public class Bubble {
    public static void  sort(int number[])
    {
        int swap=0;
        for(int i=0;i<number.length-1;i++)
        {
            
            for(int j=0;j<number.length-1-i;j++)
            {
                if(number[j] >number[j+1])
                {
                    int temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                    swap++;
                }
            }
           
        }
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();
        System.out.println("Total swap is = "+swap);

      
    }
    public static void main(String[] args) {
        int number[]={5,4,1,2,3};
        sort(number);
    }
    
}
