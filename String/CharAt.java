package String;

public class CharAt {
    public static void print(String Fullname)
    {
        for(int i=0;i<Fullname.length();i++)
        {
            System.out.print(Fullname.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        String first="Piyush";
        String last="Choudhary";
        String Fullname=first+" "+last;
        System.out.println(first.length());
        System.out.println(first.charAt(5));
       print(Fullname);
    }
    
}
