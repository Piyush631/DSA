package Arrays;

public class LinearString {
    public static int find(String menu[], String key)
    {
    
        for(int i=0;i<menu.length;i++)
        {
            if(menu[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String menu[]={"samosa","sandwich","cofffe","tea"};
        String key= "cofffe";
       
        System.out.println(find(menu,key));
   
        
      
     
    }
}
