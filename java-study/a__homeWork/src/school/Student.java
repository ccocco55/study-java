package school;

import java.util.Objects;

public class Student {
    private String name;
    private int score;
    private int number;
    
    public Student() {;}
    
    public Student(Student student) {
    	this(student.name, student.score, student.number);
    }

	public Student(String name, int score, int number) {
		super();
		this.name = name;
		this.score = score;
		this.number = number;
	}
	
	

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getScore() {
		return score;
	}

	protected void setScore(int score) {
		this.score = score;
	}

	protected int getNumber() {
		return number;
	}

	protected void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
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
		return number == other.number;
	}
    
    
}
