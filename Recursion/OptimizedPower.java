package Recursion;

public class OptimizedPower {
    public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;

        }
        int half=power(x,n/2);
        int halfsq=half*half;
        if(n%2 != 0)
        {
            halfsq=x*halfsq;
        }
        return halfsq;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
        
    }
    
}
