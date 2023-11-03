package Advance_Patterns;

public class Butterfly {
    public static void fly(int n)
    {
        //first half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int s=1;s<=2*(n-i); s++)
            {
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
           for(int i=n;i >=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"); //stars
            }
            for(int s=1;s<=2*(n-i); s++) //spaces 2*n-1
            {
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        fly(4);
        
    }
    
}
