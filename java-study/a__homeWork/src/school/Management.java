package school;

public class Management {
	
	public void addStudent(Student student) {
		DB.students.add(new Student(student));
	}
	
	public boolean highScore(Student student) {
		return student.getScore() >= 90;
	}
}
