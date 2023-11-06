package Arrays;

public class LinearSearch {
    public static int search(int number[],int key)
    {
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key=14;
        int index=search( number,key);
        System.out.println(number.length);
        if(index==-1)
        {
            System.out.println("key is not found");

        }
        else{
            System.out.println("key is found at " + index);
        }
    
        
    }
    
}
