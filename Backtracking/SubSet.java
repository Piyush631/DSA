package Backtracking;

public class SubSet {
    public static void findsubset(String str,int i,String ans)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        findsubset(str, i+1, ans+str.charAt(i));
        findsubset(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        findsubset(str, 0, ans);
        
    }
    
}
