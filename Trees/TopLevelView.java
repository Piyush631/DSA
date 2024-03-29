package Trees;
import java.util.*;

public class TopLevelView {    
    static class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
static class Info{
    int hd;
    Node node;
    Info(int hd,Node node)
    {
        this.hd=hd;
        this.node=node;
    }
}
public static void toplevel(Node root)
{
    Queue<Info>q=new LinkedList<>();
    HashMap<Integer,Node>map=new HashMap<>();
    int min=0;
    int max=0;
    q.add(new Info(0,root));
    q.add(null);
    while(!q.isEmpty())
    {
        Info curr=q.remove();
        if(curr==null)
        {
            if(q.isEmpty())
        {
            break;
        }else{
            q.add(null);
        }
     }else{
         if(!map.containsKey(curr.hd))
    {
        map.put(curr.hd,curr.node);
    }
    if(curr.node.left !=null)
    {
        q.add(new Info(curr.hd-1,curr.node.left));
        min=Math.min(min,curr.hd-1);
        
    }
       if(curr.node.right !=null)
    {
        q.add(new Info(curr.hd+1,curr.node.right));
        max=Math.max(min,curr.hd+1);
        
    }
    }
   
    }
    for(int i=min;i<=max;i++)
    {
        System.out.print(map.get(i).data+" ");
    }
    System.out.println();

}
    public static void main(String[] args) {
          /*
         1
        / \
       2   3
      / \ /  \
    4   5 6   7

         */

         Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);
         toplevel(root);
    }
    
}
