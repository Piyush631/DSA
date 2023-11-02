package Practice;
 public class Palindrome{
    public static void palin(int n)
    {
        int myNum=n;
        int rev=0;
        while(n > 0)
        {
            int last_digit=n%10;
            rev=(rev*10) + last_digit;
            n=n/10;
        }
        if(myNum==rev)
        {
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
    public static void main(String[] args) {
        palin(121);
        
    }
 }