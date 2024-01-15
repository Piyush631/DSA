package BinarySearchTree;
import java.util.*;

public class MergeBst {
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
    public static Node createBst(ArrayList<Integer>list2,int st,int en)
    {
        if(st > en)
        {
            return null;
        }
        int mid=(st+en)/2;
        Node root=new Node(list2.get(mid));
        createBst(list2, st, mid-1);
        createBst(list2, mid+1, en);
        return root;
    }
    public static Node sort(Node root1,Node root2)
    {
        ArrayList<Integer>list1=new ArrayList<>();
        inorder(root1, list1);
        ArrayList<Integer>list2=new ArrayList<>();
        inorder(root2, list2);
        int i=0; int j=0;
        ArrayList<Integer>list3=new ArrayList<>();
        while(i < list1.size() && j < list2.size())
        {
            if(list1.get(i) <= list2.get(j))
            {
                list3.add(list1.get(i));
                i++;
            }
            else{
                list3.add(list2.get(i));
                j++;
            }

        }
        while(i < list1.size())
        {
            list3.add(list1.get(i));
                i++;
        }
        while(j < list2.size())
        {
            list3.add(list2.get(j));
                j++;
        }
        return createBst(list3, 0, list3.size()-1);

    }
public static void preorder(Node root)
{
    if(root==null)
    {
        return;
    }
    preorder(root.left);
    System.out.print(root.data+" ");
    preorder(root.right);
}
    public static void main(String[] args) {
        //first tree
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.left=new Node(4);

        //second tree
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        Node root=sort(root1, root2);
        preorder(root);
    }
    
}
