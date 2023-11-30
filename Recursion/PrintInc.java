package Recursion;

public class PrintInc {
    public static void printinc(int n)
    {
        if(n==1)
        {
            System.out.print(1+" ");
            return;
        }
  
        printinc(n-1);  //recurson
        System.out.print(n +" ");
    }

    public static void main(String[] args) {
        int n=10;
        printinc(n);
    }
    
    
}
