package String;
import java.util.*;


public class StrBuilder {
    public static void main(String[] args) {
      StringBuilder str=new StringBuilder("");
        for(char ch='a'; ch<='z';ch++)
        {
          
        str.append(ch);
        }
        System.out.print(str);

    }

     
    
}
