package BinarySearchTree;
import java.util.*;
public class BstToBalance {
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
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;

        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root,ArrayList<Integer>list)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right,list);

    }
    public static Node createTree(ArrayList<Integer>list,int st,int end)
    {
        if(st > end)
        {
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(list.get(mid));
       root.left= createTree(list, st, mid-1);
        root.right=createTree(list, mid+1, end);
        return root;
    }

    public static Node balance(Node root)
    {
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root, list);
        root=createTree(list, 0, list.size()-1);
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
       root= balance(root);
        preorder(root);
    }
    
}
