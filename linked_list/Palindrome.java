package linked_list;

public class Palindrome {
    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int  size;
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public Node findMid( Node head)
    {
        Node slow=head;
        Node fast=head;
        
        while(fast != null && fast.next != null )
       {
        slow=slow.next;
        fast=fast.next.next;
       }
       return slow;
    }
    public boolean check()
    {
        if(head==null || head.next ==null)
        {
            return true;
        }
        //find mid
        Node mid=findMid(head);
        //reverse
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //Compare
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
    public static void main(String[] args) {
        Palindrome ll=new Palindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll.check());
      
    
        
    }
}
