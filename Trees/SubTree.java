package Trees;

public class SubTree {
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
    public static boolean isidentical(Node root,Node subroot)
    {
        if(root==null && subroot==null)
        {
            return true;
        }
        else if(root ==null || subroot==null || root.data != subroot.data)
        {
            return false;
        }
        if(!isidentical(root.left, subroot.left))
        {
            return false;
        }
        if(!isidentical(root.right, subroot.right))
        {
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data == subroot.data)
        {
            if(isidentical(root,subroot))
            {
                return true;
            }
          
            
        }
          boolean leftans=isSubtree(root.left, subroot);
            boolean rightans=isSubtree(root.right, subroot);
        return leftans||rightans;
    }
    public static void main(String[] args) {
         /*
         1
        / \
       2   3
      / \ /  \
    5   6 7   8

         */

         Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(5);
         root.left.right=new Node(6);
         root.right.left=new Node(7);
         root.right.right=new Node(8);
/*   

              2   
             / \ 
            5   6 
   
 */
        Node subroot=new Node(2);
        subroot.left=new Node(5);
        subroot.right=new Node(6);
        System.out.println(isSubtree(root, subroot));



    }
    
}
