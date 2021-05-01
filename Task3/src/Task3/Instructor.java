package Task3;

public class Instructor extends User {
	//Fields
	private String instructorId = Math.round(Math.random()*10000)+""+this.getId();
	private String profession;
	//Constructors
	public Instructor() {
		super();
	}	
	public Instructor(String profession) {
		super();		
		this.profession = profession;
	}
	//Getters : Setters
	public String getInstructorId() {
		return instructorId;
	}
	
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
