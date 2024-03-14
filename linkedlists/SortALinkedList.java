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
    
}
