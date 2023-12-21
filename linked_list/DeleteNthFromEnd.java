package linked_list;

public class DeleteNthFromEnd {
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
    public  void addfirst(int data)
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
    public void print()
    {
        Node temp =head;
        while(temp !=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void deleteFromNthLast( int n)
    {
        int size=0;
        Node temp=head;
        while(temp != null)
        {
            size++;
            temp=temp.next;
        }
        int i=1;
        int sz=size-n;
        Node prev=head;
        while(i < sz)
        {
        prev=prev.next;
        i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args) {
        DeleteNthFromEnd  ll=new DeleteNthFromEnd ();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        ll.deleteFromNthLast(2);
        ll.print();

        
    }
    
}
