package kodlamaioApp;

public class App {
	public static void main (String[] args) {
	
		Student s = new Student();
		StudentManager sM = new StudentManager();
		
		sM.register(s);
		sM.login(s);
		s.setCoursesName("Java");
		s.setHowManyPercent(36);
		s.getCoursesName();
		s.getHowManyPercent();
		
		
		Instructor ı = new Instructor();
		InstructorManager ıM = new InstructorManager();
		
		ıM.register(ı);
		ıM.login(ı);
		ı.getFirstName();
		ı.getLastName();
		ı.getTeachesCoursesName();
	}

}
