package SortingReverse;

public class Selection {
    public static void sort(int number[])
    {
        
        for(int i=0;i<number.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<number.length;j++)
            {
                if(number[min] < number[j])
                {
                    min=j;
                  
                }
             
            }
                int temp=number[min];
                    number[min]=number[i];
                    number[i]=temp;

           
           
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
