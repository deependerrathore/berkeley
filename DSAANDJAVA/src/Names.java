/**The Names class provides a single function , main , that will 
 * perform various manipulations of the name Deepak Singh Rathore
 * This is a modification of the program on page 43 of arnow and weiss.
 */
public class Names {
/**Performs various string operations on the name Deepak .Singh Rathore
 * 
 */
	public static void main(String[] args) {
		String first ="Deepak";
		String middle = "Singh";
		String last = "Rathore";
		String initials;
		String firstInit,middleInit,lastInit;
		
		firstInit = first.substring(0,1);
		middleInit = middle.substring(0,1);
		lastInit= last.substring(0,1);
		
		initials = firstInit.concat(middleInit);
		initials = initials.concat(lastInit);
		System.out.println();
		
		System.out.println(first + " " +middle + " "+last + " ");
		System.out.println(initials);
		System.out.println(last +", " + middle+ ", "+last);
		System.out.println(last +", "+last+", "+middleInit);
		System.out.println(first.toUpperCase() + " "+last.toUpperCase());
		
		System.out.println(first+ " equals Deepak is "+first.equals("deepak"));
		System.out.println(first+ " equals Deepak(ignore case) is " +first.equalsIgnoreCase("deepak"));
		System.out.println("The character at index 3 in " + middle + " is "+ middle.substring(2,3));//Start at 2 and end at three
		System.out.println("The index of \"ore\" within " +last + " is "+last.indexOf("ore"));
		System.out.println();
		
		
		
		
	}
	
	
}
