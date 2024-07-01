package linkedlists;

/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * }
 * 
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * 
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * }
 * 
 *****************************************************************/

public class Solution {
    public static Node sortList(Node head) {
        // Write your code here
        if (head==null || head.next==null) {
            return head;
        }
        //we will need 3 dummy nodes and 3 pointers as well
        Node zeroHead=new Node(-1);
        Node zero=zeroHead;
        Node oneHead=new Node(-1);
        Node one=oneHead;
        Node twoHead=new Node(-1);
        Node two=twoHead;
        //temp pointer to head for itr
        Node temp=head;
        while (temp!=null) {
            if (temp.data==0) {
                zero.next=temp;
                zero=zero.next;
            }
            else if (temp.data==1) {
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }   
        //checking the nodes and connecting them altogether
        zero.next=(oneHead.next!=null)?oneHead.next:twoHead.next;
        one.next=twoHead.next;
        two.next=null;
        return zeroHead.next;
    }
}