package Trees;
import java.util.*;


public class Practice {
     static  class Node{
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
            public static Node buildtree(int nodes[])
            {
                idx++;
                 if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
              return newNode;
            }
         
        }
       public  static void level(Node root,int level,int k)
       {
       if(root==null)
       {
        return;
       }
       if(level==k)
       {
        System.out.println(root.data+" ");
        return;
       }
       level(root.left,level+1,k);
       level(root.right,level+1,k);
       }
        
    public static void main(String[] args) {  
        BinaryTree tree=new BinaryTree();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    
     Node root=tree.buildtree(nodes);
     level(root, 0, 2);
    
       
    }
    
}
