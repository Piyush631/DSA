package Recursion;

public class PrintDec {
    public static void printdec(int n)
    { 
        if(n==1)   //base case
        {
            System.out.print(1);
            return;
        }
        System.out.print(n +" ");
        printdec(n-1);   //recursion calling
    }
    public static void main(String[] args) {
        int n=10;
        printdec(n);
    }
    
}
