
package kodlamaioApp;
import java.util.*;
public class UserManager {

	public void login(User user)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("giriþ için maili girin:");
			while(!user.getMail().equals(kb.nextLine()))
				System.out.println("Yanlýþ mail");
		
		System.out.println("giriþ için þifre girin:");
		while(!user.getPassword().equals(kb.nextLine()))
			System.out.println("Yanlýþ þifre");
		
		
		
	
			
	}
}
