package Task3;



public class InstructorManager extends UserManager{
	
	
	
	public void getProfession(Instructor instructor) {
		System.out.println(instructor.getUserName()+" kullanýcý adýna ait eðitmenin alaný : "+instructor.getProfession());
		
	}
	public void getInstructorId(Instructor instructor) {
		System.out.println(instructor.getUserName()+" kullanýcý adýna ait eðitmenin id'si : "+instructor.getInstructorId());
		
	}
}
