package classTest;

public class Teacher {
	int[] arAnswer;

	public Teacher(int[] arAnswer) {
		this.arAnswer = arAnswer;
	}
	
	int check(Child child) {
		int score = 0;
		for (int i = 0; i < child.arAnswer.length; i++) {
			if(child.arAnswer[i] == this.arAnswer[i]) {	// 선생님 답과 아이의 답이 같다면
				score += 10;	// 점수에 10점 씩 추가
			}
		}
		
		return score;
	}
	
}

