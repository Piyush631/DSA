package Arrays;

public class Rotate {
    public static void ro(int number[],int key)
    {
        int first=0;
        int last=number.length;
        int mid=first+last/2;
        int n=mid-1;
        while(first<=n)
        {
            int temp=number[first];
            number[first]=number[mid];
            number[mid]=temp;
            first++;
            mid++;
        }
    
    }

    public static void main(String args[])
    {
        int number[]={0,1,2,4,5,6,7};
       
       int key=0;
        ro(number,key);
            for(int i=0;i<number.length;i++)
        
                
        {
            System.out.print(number[i]+" ");
        }
       

      
   

    }
    
}
