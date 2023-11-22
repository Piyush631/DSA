package BitManipulation;

public class SetithBit {
    public static int set(int n,int i)
    {
        int bitMask=1 << i;
        return n|bitMask;
    }
    public static int clear(int n,int i)
    {
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n=10;
        int i=2;
        System.out.println(set(n,i));
           System.out.println(clear(10,1));

        
    }
    
    
}
