package Recursion;

public class Fibonacci {
    public static int fib(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        return f1+f2;
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println((fib(n)));
    }
    
}
