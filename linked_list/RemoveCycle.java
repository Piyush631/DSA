package linked_list;

public class RemoveCycle {
    public  static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static  boolean checkCycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }

        }
        return false;
    }
    public   static void  remove(){
      
        Node slow=head;
        Node fast=head;
        boolean detect=false;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                detect= true;
                break;
            }
        }
        if(detect==false)

        {
            return ;
        }
       //find metting point

       slow=head;
       Node prev=null;
        while(fast != slow)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle
        prev.next=null;

    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(checkCycle());
        remove();
        System.out.println(checkCycle());
        
    }
    
}
