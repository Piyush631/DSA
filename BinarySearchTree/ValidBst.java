package BinarySearchTree;

public class ValidBst {
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
    public static boolean isValid(Node root,Node min, Node max)
    {
        if(root==null)
        {
            return true;
        }
        if(min != null && root.data <= min.data)
        {
            return false;
        }
        else if(max != null && root.data >= max.data)
        {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right,root,max);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root, values[i]);
        }
        if(isValid(root, null, null))
        {
            System.out.println("valid bst");
        }
        else{
            System.out.println("Not valid Bst");
        }
    }
    
}
