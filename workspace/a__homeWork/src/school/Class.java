package school;

import java.util.ArrayList;
import java.util.Arrays;

public class Class {
	public static void main(String[] args) {
		Management management = new Management();
		
		management.addStudent(new Student("alice", 95, 1));
		management.addStudent(new Student("bob", 82, 2));
		management.addStudent(new Student("charlie", 91, 3));
		management.addStudent(new Student("david", 76, 4));
		management.addStudent(new Student("eve", 88, 5));
		
		DB.students.stream().filter(student -> management.highScore(student)).forEach(System.out::println);
		DB.students.stream().sorted((s1, s2) -> s1.getNumber() - s2.getNumber()).forEach(System.out::println);
		
	}
}
