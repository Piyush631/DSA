public class ArrayPractice {
    public static boolean pra(int number[])
    {
          
         
        for(int i = 0; i<=number.length-1;i++)
        {
            for(int j=1;j<=number.length;j++)
            {
                if(number[i]==number[j])
                {
                    return true;
                }
               
            
            }
           
        }
        return false;
    }
    public static void main(String args[])
        {
            int number[]={1,2,3,4};
           System.out.println(pra(number));
        }
    
}
