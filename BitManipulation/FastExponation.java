package BitManipulation;

public class FastExponation {
    public static int exponation(int a, int n)
    {
        int ans=1;
        while(n > 0)
        {
            if((n & 1)==1)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(exponation(3,5));
        
    }
    
}
