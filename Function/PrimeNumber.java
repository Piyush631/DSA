package Function;
import java.util.*;

public class PrimeNumber {
    public  static boolean isPrime(int n)
    {
        //corner case
       boolean isPrime=true;
        if(n==2)
        {
            return true;
        }
        for(int i =2; i <= Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    
        System.out.println(isPrime(5));
        System.out.println(isPrime(18));
    }
}
