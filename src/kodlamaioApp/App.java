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
		
		
		Instructor � = new Instructor();
		InstructorManager �M = new InstructorManager();
		
		�M.register(�);
		�M.login(�);
		�.getFirstName();
		�.getLastName();
		�.getTeachesCoursesName();
	}

}
