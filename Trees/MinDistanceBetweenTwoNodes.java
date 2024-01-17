package Trees;

public class MinDistanceBetweenTwoNodes {
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
    public static Node lca2(Node root,int n1,int n2)
    {
        if(root==null || root.data==n1 || root.data==n2)
        {
            return root;
        }
        Node leftlca=lca2(root.left, n1, n2);
        Node rightlca=lca2(root.right,n1,n2);
        if(rightlca==null)
        {
            return leftlca;
        }
        if(leftlca==null){
            return rightlca;
        }
        return root;
    }
    public static int min(Node root,int n)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }
        int left=min(root.left, n);
        int right=min(root.right,n);
        if(left==-1 && right ==-1)
        {
            return -1;
        }
        else if(left==-1)
        {
            return right+1;
        }
        else{
            return left+1;
        }
    }
    public static int minDist(Node root,int n1,int n2)
    {
        Node lca=lca2(root,n1,n2);
        int leftmin=min(lca,n1);
        int rightmin=min(lca,n2);
        return leftmin+rightmin;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    int n1=4;
    int n2=6;
    System.out.println(minDist(root,n1,n2));
    }
    
}
