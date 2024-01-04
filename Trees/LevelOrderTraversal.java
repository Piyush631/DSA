package Trees;

import java.util.*;

public class LevelOrderTraversal {
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
        public static Node buildtree(int nodes[])

        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left= buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }
        public static void levelOrder(Node root)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node curr=q.remove();
                if(curr==null)
                {
                    System.out.println();
                     if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
                }
                else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null)
                    {
                        q.add(curr.left);
                    }
                    if(curr.right!=null)
                    {
                        q.add(curr.right);
                    }
                }
               
                
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    
     Node root=tree.buildtree(nodes);
     tree.levelOrder(root);
        
    }
    
}
