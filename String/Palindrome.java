package String;

public class Palindrome {
    public static boolean palin(String str)
    {
       
        for(int i=0;i<str.length()/2;i++)
        {
             int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                System.out.println();
                return false;
            }
            
            
        }
    
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println("is palindrome "+palin(str));
    }
    
}
