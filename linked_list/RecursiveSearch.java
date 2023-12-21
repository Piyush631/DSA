package linked_list;

public class RecursiveSearch {
    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=next;
        }
  
    }
          public static Node head;
        public static Node tail;
        public static int size;
    public void addFirst(int data)
    {
        
       Node newnode=new Node(data);
       size++;
       if(head==null)
       {
        head=tail=newnode;
        return;
       }
       
       newnode.next=head;
       head=newnode;

    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp !=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
     System.out.println("null");
    }
    //search
    public static int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1)
        {
            return -1;
        }else{
            return idx+1;
        }

    }
    public static int search(int key)
    {
       return  helper(head,key);
    }

    //reverse a linked list
    public static void reverseList()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr != null)
        {
              next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        RecursiveSearch ll=new RecursiveSearch();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(search(3));
        System.out.println(search(30));
        ll.reverseList();
        ll.print();
    }
    
}
