package Advance_Patterns;

public class HalfPyramid {
    public static void half(int n)
    {
        for(int i=1; i <= n; i++)
        {
                //spaces
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i;j++)
            {
               System.out.print("*");  
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        half(4);
        
    }
    
}
