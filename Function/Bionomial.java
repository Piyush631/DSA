package Function;

public class Bionomial {
    

    public static int factorial(int f)
    {
        int fact=1;
       while(f >=1)

       {
        fact=fact*f;

       }
        return fact;
    }
    public static int bionomial(int n, int r)
    {
        int n1=factorial(n);
    int r1=factorial(r);
        int val=factorial(n-r);
        int ans=n1/(r1*val);
        return ans;

    }
    public static void main(String[] args) {
       
        System.out.println(bionomial(5,2));
    }    
}

    

