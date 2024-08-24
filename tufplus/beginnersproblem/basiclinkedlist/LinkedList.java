package tufplus.beginnersproblem.basiclinkedlist;

public class LinkedList {
    ListNode head;
    
    //insert new node func
    public void insert(int data){
        ListNode newNode = new ListNode(data);
        if (head==null) {
            head=newNode;
            return;
        }
        ListNode tmp = head;
        while (tmp.next!=null) {
            tmp=tmp.next;
        }
        tmp.next=newNode;
    }
    
    //delete head func
    public ListNode deleteHead(ListNode head){
        if (head==null) {
            return null;
        }
        head=head.next;
        return head;
    } 
    
    // delete tail func
    public ListNode deleteTail(ListNode head){
        if (head==null || head.next==null){
            return null;
        }
        ListNode temp = head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        
        return head;
    }

    //print linkedlist func
    public void printLL(ListNode head){
        if (head==null) {
            System.out.println("None");
        }
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.val+" ->");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.printLL(ll.head);

        ll.head= ll.deleteHead(ll.head);
        ll.printLL(ll.head);
        ll.insert(4);
        ll.insert(5);
        ll.head=ll.deleteTail(ll.head);
        ll.printLL(ll.head);
    }


}
