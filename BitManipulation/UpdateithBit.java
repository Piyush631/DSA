package BitManipulation;

public class UpdateithBit {
    public static int clear(int n, int i)
    {
        int bitmask=~(1 << i);
        return n & bitmask;
    }
    public static int update(int n, int i , int newbit)
    {
        n=clear(n,i);
        int newmask=newbit << i;
        return n | newmask;
    }
    public static void main(String[] args) {
        System.out.println(update(10,2,1));
        
    }
    
}
