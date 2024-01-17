package Trees;
public class HeightOfTrees {
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
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
     public static int count(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=count(root.left);
        int rh=count(root.right);

       
        int sum=(lh+rh)+1;
         return sum;
    }
    public static int sum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
       int ls=sum(root.left);
       int rs=sum(root.right);
       return (ls+rs)+root.data;

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
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));

    }
    }
    


    

