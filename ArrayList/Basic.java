package ArrayList;
import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        // create a list
        ArrayList<Integer>list=new ArrayList<>();
        //add element
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(3);

        //get element 

        System.out.println(list.get(2));

        //remove
        list.remove(2);

        // set element
        list.set(1,8);
        System.out.println(list);
        //contain elemetn

        System.out.println(list.contains(5));

        int n=list.size();
        System.out.println(n);
    }
    
}
