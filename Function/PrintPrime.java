package Function;

public class PrintPrime {
    public static boolean isPrime(int n)
    {
    boolean isPrime=true;
    
        if(n==2)
        {
            return true;
        }
        for(int i = 2 ; i <= n-1; i++)
        {
            if(n%2==0)
            {
                return false;
            }
           
        }
         return true;
    }
    public static void primeInRange(int n)

    {
        for(int i = 2; i <= n;i++)
        {
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        primeInRange(20);
        
    }
    
}
