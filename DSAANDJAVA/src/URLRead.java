import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class URLRead {
	public static void main(String[] args) throws Exception {
		URL u = new URL("http://www.google.com");
		
		InputStream i = u.openStream();
		BufferedReader read = new BufferedReader(new InputStreamReader(i));
		System.out.println(read.readLine());
		
	}
}
