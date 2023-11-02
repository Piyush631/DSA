package Practice;

public class Even {
    public static boolean isEven(int n)
    {
       boolean isEven=true;
       if(n%2==0)
       {
        return true;
       }
       return false;
    }
    public static void main(String[] args) {
      int num=4;
        if(isEven(num)==true)
        {
            System.out.println("number is even");

        }
        else{
            System.out.println("No is not");
        }
       
        
    }
    
}
