public class LinearSearch {
    public static int linear(int number[], int key)
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
    public static void main(String args[])
    {
        int number[]={10,12,15,23,45,56,58};
      
        int key=23;
        int result=linear(number,key);
        if(result==-1)
        {
            System.out.println("Not found");
        }
        else{
            System.out.println("key at "+result);
        }


    }
    
}
