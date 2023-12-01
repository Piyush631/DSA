package Recursion;

public class Tiling {
    public static int fill(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        //calculate vertical
        int fnm1=fill(n-1);
        //horizontal
        int fnm2=fill(n-2);

        int ways=fnm1+fnm2;
        return ways;
    }
    public static void main(String[] args) {
        System.out.println(fill(4));
        
    }
    
}
