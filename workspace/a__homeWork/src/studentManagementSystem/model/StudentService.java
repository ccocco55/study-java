package studentManagementSystem.model;

import java.util.ArrayList;

public class StudentService {
	
//	학생 추가 (Create)
//	전체 학생 목록 조회 (Read All)
//	학번으로 특정 학생 검색 (Read One)
//	특정 학생 정보 수정 (Update)
//	특정 학생 삭제 (Delete)
	
	public void addStudent(Student student) {
		DBConnecter.students.add(student);
	}
	
	public void checkAllStudent() {
		for (int i = 0; i < DBConnecter.students.size(); i++) {
			System.out.println(DBConnecter.students.get(i)); 
		}
	}
	
	public Student checkStudent(String studentNumber) {
		ArrayList<Student> checkStudents = new ArrayList<Student>();
		for (int i = 0; i < DBConnecter.students.size(); i++) {
			if (DBConnecter.students.get(i).getStudentNumber().equals(studentNumber)) {
				return DBConnecter.students.get(i);
			}
		}
		return null;
	}
	
	public void changeSudent(String studentNumber, String name , int age) {	
		Student student = checkStudent(studentNumber);
		if (student != null) {
			student.setAge(age);
			student.setName(name);
			System.out.println("학생 정보를 수정했습니다.");
		}
		else {
			System.out.println("학생을 찾을 수 없습니다.");
		}
	}
	
	private void deleteSudent(String studentNumber) {
		for (int i = 0; i < DBConnecter.students.size(); i++) {
			if (DBConnecter.students.get(i).getStudentNumber().equals(studentNumber)) {
				DBConnecter.students.remove(i);
				System.out.println("학생 정보를 삭제했습니다!");
			}
			else {
				System.out.println("학생을 찾을 수 없습니다.");
			}
		}
	}
	
}
