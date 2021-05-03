package kodlamaioApp;

import java.util.Scanner;

public class InstructorManager extends UserManager {
	

	
	public void login(Instructor �nstructorUser)
	{
		System.out.println("E�itmen giri� yap�yor");
		super.login(�nstructorUser);
		
	}
	public void addACourse(Instructor �nstructorUser, String strCourse) {
		�nstructorUser.setTeachesCoursesName(strCourse);
	}

	public  void register(Instructor �nstructorUser)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("kay�t olmak i�in mailini girin:");
		�nstructorUser.setMail(kb.nextLine());
	
		System.out.println("kay�t olmak i�in �ifre olu�turun:");
		�nstructorUser.setPassword(kb.nextLine());
		
		
		
		System.out.println("parolan�z� do�rulay�n�z:");
		while(!�nstructorUser.getPassword().equals(kb.nextLine()))
			System.out.println("�ifreyi yanl�� girdiniz, tekrar deneyiniz");
	}
	
	
}
