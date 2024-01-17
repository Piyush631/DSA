package Trees;

public class DiameterOfATree {
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
    public static int maxDiameter(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ld=maxDiameter(root.left);
        int lh=height(root.left);
        int rd=maxDiameter(root.right);
        int rh=height(root.right);
        int self=(lh+rh)+1;
        return Math.max(self,Math.max(ld,rd));

    }
    //approch 2nd
    static class Info{
        int diam;
        int ht;
        Info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }

    }
    public static Info diameter2(Node root)
    {
        if(root==null)
        {
            return new Info(0,0);
        }
        
        Info left=diameter2(root.left);
        Info right=diameter2(root.right);
        int diam=Math.max(Math.max(left.diam,right.diam),left.ht+right.ht+1);
        int ht=Math.max(left.ht,right.ht)+1;
        return new Info(diam,ht);
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
         System.out.println(maxDiameter(root));
         System.out.println(diameter2(root).diam);
    }
    
}
