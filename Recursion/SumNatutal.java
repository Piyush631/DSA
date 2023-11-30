package Recursion;

public class SumNatutal {
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int s=sum(n-1);
        int total=n+s;
        return total;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println((sum(n)));

        
    }
    
}
