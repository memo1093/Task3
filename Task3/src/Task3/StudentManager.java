package Task3;


public class StudentManager extends UserManager{
	public void getStudentId(Student student) {
		System.out.println(student.getUserName()+" kullan�c� ad�na ait ��rencinin numaras� : "+student.getStudentId());
		
	}
	public void getLessons(Student student) {
		System.out.println(student.getUserName()+" kullan�c� ad�na ait ��rencinin dersleri : ");
		for (String lesson : student.getLessons()) {
			System.out.println(lesson);
		}
		
	}
	public void addLessons(Student student,String... newLessons) {
		for (String lesson : student.getLessons()) {
			for (String newLesson : newLessons) {
				String[] newLessonCopy = {newLesson,lesson};
				student.setLessons(newLessonCopy);
			}
		}
		
		System.out.println("Dersler ba�ar�yla eklendi");
	}
	
}
