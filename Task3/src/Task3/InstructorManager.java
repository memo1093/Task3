package Task3;



public class InstructorManager extends UserManager{
	
	
	
	public void getProfession(Instructor instructor) {
		System.out.println(instructor.getUserName()+" kullan�c� ad�na ait e�itmenin alan� : "+instructor.getProfession());
		
	}
	public void getInstructorId(Instructor instructor) {
		System.out.println(instructor.getUserName()+" kullan�c� ad�na ait e�itmenin id'si : "+instructor.getInstructorId());
		
	}
}
