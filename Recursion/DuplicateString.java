package Recursion;

public class DuplicateString {
    public static void duplicate(String str,int idx,StringBuilder sb, boolean map[])
    {
        
         if(idx==str.length())
         {
            System.out.print(sb);
            return;
         }
         char currchar=str.charAt(idx);
         if(map[currchar-'a']==true)
         {
            duplicate(str, idx+1,sb, map);

         }
         else{
            map[currchar-'a']=true;
            duplicate(str, idx+1, sb.append(currchar), map);
         }

    }
    public static void main(String[] args) {
        int idx=0;
        String str="appnnacollege";
        StringBuilder sb=new StringBuilder();
        boolean map[]= new boolean[25];
        duplicate(str, idx, sb, map);
        
    }
    
}
