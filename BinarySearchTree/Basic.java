package BinarySearchTree;
public class Basic {
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
public static void inorder(Node root)
{
    if(root==null)
    {
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
public static void preorder(Node root)
{
    if(root==null)
    {
        return;
    }
    System.out.print(root.data+" ");
    inorder(root.left);
   
    inorder(root.right);
}

public static Node invert(Node root)
{
    if(root==null)
    {
        return root;
    }
    root.left=invert(root.left);
    root.right=invert(root.right);
    Node temp=root.left;
    root.left=root.right;
    root.right=temp;
    return root;
    
}
public static void main(String[] args) {
    int values[]={5,1,3,4,2,7};
    Node root=null;
    for(int i=0;i<values.length;i++)
    {
       root= insert(root, values[i]);
    }
    inorder(root);
    invert(root);
    System.out.println();
    preorder(root);
    
}
    
}
