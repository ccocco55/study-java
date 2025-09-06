package classTest;

public class ClassTask13 {
//	화면
	
//	선생님이 아이의 문제를 채점한다.
//	문제는 총 10문제이다.
//	1문제당 10점이고, 아이의 점수를 리턴한다.
	
//	선생님(Teacher)
//	정답
	
//	아이(Child)
//	답안
	public static void main(String[] args) {
		Child child = new Child(new int[] {3, 2, 2, 3, 4, 2, 5, 5, 1, 2});
		Teacher teacher = new Teacher(new int[] {1, 3, 2, 3, 4, 4, 3, 2, 5, 2});
		
		int score = teacher.check(child);	// 아이와 선생님의 답 비교 후 점수
		
		System.out.println(score);
	}
}


