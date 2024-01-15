package BinarySearchTree;
import java.util.*;

public class RootToleaf {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        if(root.data > val)
        {
        root.left=insert(root.left, val);

        }
        else{
        root.right=insert(root.right, val);

        }
        return root;
    }
    public static void print(ArrayList<Integer>list)
    {
        for(int i=0; i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void printleaf(Node root,ArrayList<Integer>list)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.data);
        if(root.left==null && root.right==null)
        {
            print(list);

        }
        printleaf(root.left, list);
        printleaf(root.right, list);
        list.remove(list.size()-1);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root, values[i]);
        }
        ArrayList<Integer>list=new ArrayList<>();
        printleaf(root, list);
    }
    
}
