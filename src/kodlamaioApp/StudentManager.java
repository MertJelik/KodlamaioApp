package kodlamaioApp;

import java.util.Scanner;

public class StudentManager extends UserManager {
	String firstBoxString;
	String secondBoxString;
	String thirdBoxString;
	
	
	public void login(Student studentUser)
	{
		System.out.println("��renci giri� yap�yor");
		super.login(studentUser);
		
	}
	
	public  void register(Student studentUser)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("kay�t olmak i�in isminizi girin:");
		studentUser.setFirstName(kb.nextLine());
		
		System.out.println("kay�t olmak i�in soy isminizi girin:");
		studentUser.setLastName(kb.nextLine());
		
		System.out.println("kay�t olmak i�in maili girin:");
		studentUser.setMail(kb.nextLine());
		
		System.out.println("kay�t olmak i�in �ifre olu�turun:");
		studentUser.setPassword(kb.nextLine());
		
		
		
		System.out.println("parolan�z� do�rulay�n�z:");
		while(!studentUser.getPassword().equals(kb.nextLine()))
			System.out.println("�ifreyi yanl�� girdiniz, tekrar deneyiniz");
		
			
	}
	

	
	
	public void editProfile(boolean firstBox, boolean secondBox, boolean thirdBox)
	{
		if(firstBox)
			firstBoxString = "Biri yorumlar�ma yan�t verdi�inde bana haber ver.";
		if(secondBox)
			secondBoxString = " Yorum yapt���m bir tart��maya birisi yorum yapt���nda bana haber ver.";
		if(thirdBox)
			thirdBoxString = "Bilgilendirme ve promosyon postalar� almay� kabul ediyorum Kodlama.io.";
		
	}
	
}
