package kodlamaioApp;

import java.util.Scanner;

public class InstructorManager extends UserManager {
	

	
	public void login(Instructor ýnstructorUser)
	{
		System.out.println("Eðitmen giriþ yapýyor");
		super.login(ýnstructorUser);
		
	}
	public void addACourse(Instructor ýnstructorUser, String strCourse) {
		ýnstructorUser.setTeachesCoursesName(strCourse);
	}

	public  void register(Instructor ýnstructorUser)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("kayýt olmak için mailini girin:");
		ýnstructorUser.setMail(kb.nextLine());
	
		System.out.println("kayýt olmak için þifre oluþturun:");
		ýnstructorUser.setPassword(kb.nextLine());
		
		
		
		System.out.println("parolanýzý doðrulayýnýz:");
		while(!ýnstructorUser.getPassword().equals(kb.nextLine()))
			System.out.println("Þifreyi yanlýþ girdiniz, tekrar deneyiniz");
	}
	
	
}
