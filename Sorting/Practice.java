package Sorting;

public class Practice {
    public static void sort(int number[])
   {
    for(int i=1;i<number.length;i++)
    {
        int curr=number[i];
        int prev=i-1;
        while(prev >= 0 && number[prev]>curr)
        {
            number[prev+1]=number[prev];
            prev--;
        }
      number[prev+1]  =curr;
    }
   
   }
    public static void print(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int number[]={5,3,1,7,8,2,4,0};
        sort(number);
        print(number);
        
    }
    
}
