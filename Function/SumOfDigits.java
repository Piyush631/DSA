package Practice;

public class SumOfDigits {
    public static void sumDigit(int n)
    {
        int sum=0;
        while(n >0)
        {
            int last_digit=n%10;
            sum=sum+last_digit;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumDigit(546);
        
    }
    
}
