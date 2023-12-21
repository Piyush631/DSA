package linked_list;

public class BasicLinkedList {
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
    public static int size;
    //add in first
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    //add in last
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    // add in middle
    public void addMid(int idx,int data)
    {
        if(head==null)
        {
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i < idx-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public  void print()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //remove from first

    public int removeFirst(){
        if(size==0)
        {
            System.out.println("linked is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
     public int removeLast(){
        if(size==0)
        {
            System.out.println("linked is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    //search
    public static int search(int key)
    {
        Node temp=head;
        int i=0;
       while(temp != null)
        {
            if(temp.data==key)
            {
                return i;

            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        BasicLinkedList ll=new BasicLinkedList();
       
        ll.addFirst(2);
    
        ll.addFirst(1);
     
        ll.addLast(3);
     
        ll.addLast(4);
        ll.addMid(2, 9);
         ll.print();
         ll.removeFirst();
          ll.removeLast();
         ll.print();
        System.out.println(ll.size);
        System.out.println(ll.search(3));
        
    }
}
