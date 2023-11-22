package BitManipulation;

public class GetithBit {
    public static int get(int n,int i)
    {
        int bitMask=1 << i;
        if((n & bitMask)==0)
        {
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int n=10;
        int i=2;
        System.out.println(get(n,i));
        
    }
    
}
