package tufplus.beginnersproblem.basiclinkedlist;

public class InsertionbeforethevalueXinLL {
	public ListNode insertBeforeX(ListNode head, int X, int val) {

		ListNode newNode = new ListNode(val);

		if (head == null) {
			return null;
		}
        if(head.val==X){
            newNode.next=head;
            return newNode;
        }

		ListNode temp = head;
		ListNode prev = null;

		while (temp != null) {
			if (temp.val == X) {
				prev.next = newNode;
				newNode.next = temp;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
    }
}
