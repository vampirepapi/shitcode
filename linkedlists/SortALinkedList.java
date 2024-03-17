package linkedlists;

//bruteforce approach -
/*
class Solution {
    public ListNode sortList(ListNode head) {
        //list to store all values of ll
        ArrayList<Integer> al = new ArrayList<>();
        //traversing the ll
        ListNode temp = head;
        while (temp!=null) {
            al.add(temp.val);
            temp = temp.next;
        }
        //sorting the list
        al.sort(null);
        //traversing the ll
        temp = head;
        int i = 0;
        while (temp!=null) {
            temp.val = al.get(i);
            i++;
            temp = temp.next;
        }
        return head;
        
    }
}

*/ 
public class SortALinkedList {
    public ListNode sortList(ListNode head) {
        //calling mergerSort function
        return mergeSort(head);
    }
    //function to find mid of ll
    public ListNode midOfLL(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        //using slow and fast pointer to find mid
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //function to merge two sorted ll
    public ListNode merge(ListNode head1, ListNode head2){
        //dummy nodes
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        //comparing the elements of left and right half and storing the smaller element in temp array
        while(head1!=null && head2!=null){
            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp=temp.next;
        }
        //for leftovers of head1
        while (head1!=null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        //for leftovers of head2
        while (head2!=null) {
            temp.next=head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    //funtion to mergesort the ll
    public ListNode mergeSort(ListNode head){
        //base case
        if(head==null || head.next==null) return head;
        //finding mid
        ListNode mid = midOfLL(head);
        //two pointers
        ListNode head1=head;
        ListNode head2=mid.next;
        mid.next=null;
        //recursive call for left half
        ListNode newHead1 = mergeSort(head1);
        //recursive call for right half
        ListNode newHead2 = mergeSort(head2);
        //merge the two halves
        ListNode newHead = merge(newHead1,newHead2);
        return newHead;
    } 
    public static void main(String[] args){
        SortALinkedList obj = new SortALinkedList();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode result = obj.sortList(head);
        while(result!=null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
}
