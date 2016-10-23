import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Felix
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("Hello ASE2016 - how are you now? :)");
=======
		System.out.println("Hello ASE2016 - how are you? :)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your name:");
        try {
			String s = br.readLine();
			HelloUser user = new HelloUser(s);
			user.greetUser();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error trying to read your name!");
		}
>>>>>>> hello_user
	}

}
