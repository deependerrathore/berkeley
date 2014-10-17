import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ReadKB {
	public static void main(String[] args) throws Exception{
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(kb.readLine());
	}
}
