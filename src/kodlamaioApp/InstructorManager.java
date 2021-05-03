package kodlamaioApp;

import java.util.Scanner;

public class InstructorManager extends UserManager {
	

	
	public void login(Instructor ınstructorUser)
	{
		System.out.println("Eğitmen giriş yapıyor");
		super.login(ınstructorUser);
		
	}
	public void addACourse(Instructor ınstructorUser, String strCourse) {
		ınstructorUser.setTeachesCoursesName(strCourse);
	}

	public  void register(Instructor ınstructorUser)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("kayıt olmak için mailini girin:");
		ınstructorUser.setMail(kb.nextLine());
	
		System.out.println("kayıt olmak için şifre oluşturun:");
		ınstructorUser.setPassword(kb.nextLine());
		
		
		
		System.out.println("parolanızı doğrulayınız:");
		while(!ınstructorUser.getPassword().equals(kb.nextLine()))
			System.out.println("Şifreyi yanlış girdiniz, tekrar deneyiniz");
	}
	
	
}
