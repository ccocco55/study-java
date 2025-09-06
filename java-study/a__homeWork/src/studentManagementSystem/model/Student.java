package studentManagementSystem.model;

import java.util.Objects;

public class Student {
	private String studentNumber;
	private String name;
	private int age;
	
	public Student() {;}

	public Student(String studentNumber, String name, int age) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.age = age;
	}

	protected String getStudentNumber() {
		return studentNumber;
	}

	protected void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentNumber, other.studentNumber);
	}
	
	
}
