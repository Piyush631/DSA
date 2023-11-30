package Recursion;

public class Practice {
    public static int check(String s)
    {
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    return i;

                }
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        String s="abcde";
        System.out.println(check(s));

    }
    
}
