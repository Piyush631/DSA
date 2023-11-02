package Practice;

public class ReverseANum {
    public static void main(String[] args) {
        int n=567;
        int myNum=n;
        int rev=0;
        while(n>0)
        {
            int last_digit=n%10;
            rev=(rev*10)+last_digit;
            n=n/10;
    }
    System.out.print("reverse of number " + myNum +" is " + rev );
        }
        
    
}
