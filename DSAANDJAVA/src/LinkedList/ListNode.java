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
		l1.insertAfter(55);
		
		System.out.println(l1.item+ " " +l1.next.item + " "+l1.next.next.item+" "+l1.next.next.next.item);
	}
	
	public void insertAfter(int item){
		next = new ListNode(item,next);
	}
}
