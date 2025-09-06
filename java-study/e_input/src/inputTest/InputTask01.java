package inputTest;	

import java.util.Scanner;	

public class InputTask01 {		
public static void main(String[] args) {
//	반려동물 이름을 받고 출력하기
	
	String puppyname = "반려동물 이름:";	// puppyname에 반려동물 이름 묻는 값 넣기
	String name = "";	// name 초기화
	
	Scanner scanner = new Scanner(System.in);	// 입력 클래스
	
	System.out.print(puppyname);	// puppyname 출력하기
	
	name = scanner.next();	// 스캐너에서 입력 받은 값 name에 입력
	
	System.out.println(name);	// name 값 출력
	
	
	
	String puppyage = "반려동물의 나이 : ";		//// puppyage에 반려동물 이름 묻는 값 넣기
	String age = "";	// age 초기화
	
//	Scanner sc = new Scanner(System.in);	// 입력 클래스
	
	System.out.print(puppyage);	// puppyage 출력하기
	
	age = scanner.next();	// 스캐너에서 입력 받은 값 age에 입력
	
	System.out.println(age);	// age 값 출력
	
	
	
	
	
			
	
}
}
