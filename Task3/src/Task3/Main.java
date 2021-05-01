package Task3;

public class Main {

	public static void main(String[] args) {
		
		
		
		InstructorManager instructorManager= new InstructorManager();
		StudentManager studentManager= new StudentManager();
		
		//Lessons
		String[] lessons= {"Java","React"};
		
		//New Student
		Student student1 = new Student();
		student1.setId(1);
		student1.setUserName("mehmet456");
		student1.setPassword("456");
		student1.setLessons(lessons);
		
		//New Instructor
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setUserName("engindemirog");
		instructor1.setPassword("369147");
		instructor1.setProfession("Developer");
		
		//instructorManager
		instructorManager.signIn(instructor1);		
		instructorManager.logIn("engindemirog", "369147");				
		instructorManager.getInstructorId(instructor1);
		instructorManager.getProfession(instructor1);
		System.out.println(instructorManager.getUser("engindemirog").getId());		
		
		//studentManager
		studentManager.signIn(student1);		
		studentManager.logIn("mehmet456", "456");		
		studentManager.getStudentId(student1);
		studentManager.getLessons(student1);
		System.out.println(Math.round(Math.random()*10000)+""+studentManager.getUser("mehmet456").getId());
		System.out.println(studentManager.getUser("mehmet456").getId());
		
		//Not: Her seferinde yeniden kayýt yapýyor görüldüðü için id deðiþiyor.
		
		
	}

}
