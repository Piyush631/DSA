package String;

public class SubString {
    public static void sub(String str,int si,int ei)
    {
        String sub="";
        for(int i=si;i<ei;i++)
        {
            sub +=str.charAt(i);
            
        }
        System.out.println(sub);
    }
    public static void main(String args[])
    {
        String str="piyush choudhary";
        int si=4;
        int e=7;
        System.out.println(str.substring(0,5));
       
       
        sub(str,si,e);
    }
    
}
