package Trees;

public class Postorder {
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildbinary(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
           newNode.left= buildbinary(nodes);
           newNode.right=buildbinary(nodes);
           return newNode;
        }
        public static void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            postorder(root.left);
       
            postorder(root.right);
                 System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
           int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       
        Node root=tree.buildbinary(nodes);
        tree.postorder(root);
    }
    
}
