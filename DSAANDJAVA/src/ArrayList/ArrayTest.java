package ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		AList a1 = new AList();
		a1.insertItem(1, 0);
		a1.insertItem(2, 1);
		a1.insertItem(3, 2);
		a1.insertItem(4, 3);
		a1.insertItem(5, 4);
		a1.insertItem(6, 5);
		a1.insertItem(7, 6);
		a1.insertItem(8, 0);
		
		
		for(int i = 0;i<10;i++){
			System.out.println(a1.a[i]);
		}
	}
	
}
