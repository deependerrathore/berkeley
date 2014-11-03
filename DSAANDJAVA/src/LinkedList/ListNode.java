package LinkedList;

public class ListNode {
	public int item;			//ListNode is a recursive type
	public ListNode next;		//Here we're using ListNode before
								//we've finished declaring it.
	public ListNode(int i , ListNode n){
		item = i;
		next = n;
	}
	public ListNode(int i){
		this(i , null);
	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(7,new ListNode(0, new ListNode(7,null)));
		
	}
}
