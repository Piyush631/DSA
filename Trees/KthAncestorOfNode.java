package Trees;
import java.util.*;

public class KthAncestorOfNode {
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
    public static boolean getpath(Node root, int n1,ArrayList<Node>path)
    {
        if(root==null)
        {
            return false;
        }
        path.add(root);
        if(root.data==n1)
        {
            return true;
        }
        boolean foundleft=getpath(root.left, n1, path);
        boolean foundright=getpath(root.right, n1, path);
        if(foundleft || foundright)
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node kth(Node root,int n1,int k)
    {
        ArrayList<Node>path=new ArrayList<>();
        getpath(root,n1,path);
        int i=path.size()-1-k;
      Node com=path.get(i);
      return com;
        
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(kth(root, 5, 1).data);
    }
    
}
