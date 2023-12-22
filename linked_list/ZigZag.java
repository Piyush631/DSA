package linked_list;


public class ZigZag {
    public static class Node{
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
    public static void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public Node findmid(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while( fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
 
    public void zig()
    {
        Node mid=findmid(head);
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left= head;
        Node right = prev;
        Node nextL,nextR;
        while(left != null && right!= null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            right=nextR;
            left=nextL;

        }
    }
    public static void print(){
        Node temp=head;
        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       ZigZag ll=new ZigZag();
        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(1);
        ll.addFirst(9);
        ll.addFirst(7);
        ll.addFirst(1);
        ll.print();
       ll.zig();
       ll.print();

        
    }
    
}
