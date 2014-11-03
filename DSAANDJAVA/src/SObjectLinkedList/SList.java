package SObjectLinkedList;

public class SList {
	private SListNode head;
	private static int size;
	
	public SList(){
		head = null;
		size = 0;
	}
	
	public void insertFront(Object item){
		head = new SListNode(item , head);
		size++;
	}
	
	public static void main(String[] args) {
		
		SList l1 = new SList();
		l1.insertFront(5);
		l1.insertFront(7);
		
		System.out.println(l1.head.next.item);
	}
}
