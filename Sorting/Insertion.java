package Sorting;

public class Insertion {
    public static void sort(int number[])
    {
        for(int i=1;i<number.length-1;i++)
        {
            int curr=number[i];
            int prev=i-1;
            while(prev >=0 && number[prev] > curr)
            {
               number[prev+1]=number[prev];
                prev--;
            }
            number[prev+1]=curr;


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
