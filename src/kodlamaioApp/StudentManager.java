package kodlamaioApp;

import java.util.Scanner;

public class StudentManager extends UserManager {
	String firstBoxString;
	String secondBoxString;
	String thirdBoxString;
	
	
	public void login(Student studentUser)
	{
		System.out.println("Öðrenci giriþ yapýyor");
		super.login(studentUser);
		
	}
	
	public  void register(Student studentUser)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("kayýt olmak için isminizi girin:");
		studentUser.setFirstName(kb.nextLine());
		
		System.out.println("kayýt olmak için soy isminizi girin:");
		studentUser.setLastName(kb.nextLine());
		
		System.out.println("kayýt olmak için maili girin:");
		studentUser.setMail(kb.nextLine());
		
		System.out.println("kayýt olmak için þifre oluþturun:");
		studentUser.setPassword(kb.nextLine());
		
		
		
		System.out.println("parolanýzý doðrulayýnýz:");
		while(!studentUser.getPassword().equals(kb.nextLine()))
			System.out.println("Þifreyi yanlýþ girdiniz, tekrar deneyiniz");
		
			
	}
	

	
	
	public void editProfile(boolean firstBox, boolean secondBox, boolean thirdBox)
	{
		if(firstBox)
			firstBoxString = "Biri yorumlarýma yanýt verdiðinde bana haber ver.";
		if(secondBox)
			secondBoxString = " Yorum yaptýðým bir tartýþmaya birisi yorum yaptýðýnda bana haber ver.";
		if(thirdBox)
			thirdBoxString = "Bilgilendirme ve promosyon postalarý almayý kabul ediyorum Kodlama.io.";
		
	}
	
}
