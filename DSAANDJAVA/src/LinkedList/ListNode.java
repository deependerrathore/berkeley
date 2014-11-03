package LinkedList;

public class ListNode {
	public int item;			//ListNode is a recursive type
	public ListNode next;		//Here we're using ListNode before
								//we've finished declaring it.
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(),l2= new ListNode() , l3 = new ListNode();
		l1.item=7;
		l2.item=0;
		l3.item=6;
		
		l1.next = l2;
		l2.next = l3;
		l3.next = null;			//Last node refernce variable
	}
}
