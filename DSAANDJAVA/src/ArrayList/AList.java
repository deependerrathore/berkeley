package ArrayList;

public class AList {

	int a[];
	int lastItem;
	
	public AList(){
		a = new int[10];
		lastItem = -1;
	}
	
	public void insertItem(int newItem , int location){
		int i ;
		
		if(lastItem + 1 == a.length){
			int[] b = new int[2 *a.length];
			for(i = 0;i<=lastItem;i++){
				b[i] = a[i];
			}
			a = b;
		}
		for(i=lastItem;i>=location;i--){
			a[i+1] = a[i];
		}
		a[location]= newItem;
		lastItem++;
	}
	
	
}
