package tufplus.beginnersproblem.basiclinkedlist;

public class DeletionoftheKthelementofLL {
	public ListNode deleteKthNode(ListNode head, int k) {
        if(head==null) return null;
		
		ListNode temp=head;
		ListNode prev=null;
		int count=0;

		while (temp!=null) {
			count++;
			if (k==count) {
				prev.next=prev.next.next;
			}
			prev=temp;
			temp=temp.next;
		}
		return head;
    }

}

