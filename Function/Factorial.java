package Function;

public class Factorial {
    public static int fact(int n)
    {
        int f=1;
        while(n >=1)
        {
            f=f*n;
            n--;
        }
        return f;
       
    }
    //binomial coefficent
    public static int bion(int n, int r)
    {
        int n1=fact(n);
        int r1=fact(r);
        int val=fact(n-r);
        int ans=n1/(r1*val);
        return ans;
    }
    public static void main(String[] args) {
       
        System.out.println(bion(5,2)); 
    }
    
}
