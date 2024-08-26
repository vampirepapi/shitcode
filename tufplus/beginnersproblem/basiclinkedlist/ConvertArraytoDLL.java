package tufplus.beginnersproblem.basiclinkedlist;

public class ConvertArraytoDLL {
    public ListNode arrayToLinkedList(int [] nums) {
        if (nums.length==0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode temp=head;

        for(int i=1; i<nums.length; i++){
            ListNode newNode= new ListNode(nums[i],null,temp);
            temp.next=newNode;
            temp=temp.next;
        }
        return head;
    }
  
}
