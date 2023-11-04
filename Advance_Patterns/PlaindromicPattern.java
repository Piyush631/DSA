package Advance_Patterns;

public class PlaindromicPattern {
    public static void plain(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //desc
            for(int j=i;j >=1;j--)
            {
                System.out.print(j);
            }
            //asec
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
           
        }
    }
    public static void main(String[] args) {
        plain(5);
        
    }
    
}
