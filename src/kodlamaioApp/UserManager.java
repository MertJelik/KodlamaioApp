
package kodlamaioApp;
import java.util.*;
public class UserManager {

	public void login(User user)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("giri� i�in maili girin:");
			while(!user.getMail().equals(kb.nextLine()))
				System.out.println("Yanl�� mail");
		
		System.out.println("giri� i�in �ifre girin:");
		while(!user.getPassword().equals(kb.nextLine()))
			System.out.println("Yanl�� �ifre");
		
		
		
	
			
	}
}
