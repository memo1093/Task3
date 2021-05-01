package Task3;

public class Student extends User{
	//Fields
	private String studentId=Math.round(Math.random()*10000)+""+this.getId();;
	private String[] lessons;
	//Getters:Setters
	public Student() {
		
	}
	public Student(String[] lessons) {
		super();
		this.lessons = lessons;
	}
	public String[] getLessons() {
		return lessons;
	}
	
	public void setLessons(String[] lessons) {
		this.lessons = lessons;
	}
	public String getStudentId() {
		return studentId;
	}
	
	
}
