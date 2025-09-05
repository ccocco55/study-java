package classTest;

public class User {
int id;
String name;
int age;
int totalCal;

Exercise[] arExercise;

public User(int id, String name, int age,Exercise[] arExercise) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.arExercise = arExercise;
	
	for (int i = 0; i < arExercise.length; i++) {
		totalCal += arExercise[i].cal;	// 배열에 들어가있는 모든 운동의 칼로리 총 합
	}
}


}
