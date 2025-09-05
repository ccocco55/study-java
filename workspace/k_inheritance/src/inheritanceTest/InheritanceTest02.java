package inheritanceTest;
class Animal {
	String name;
	int age;
	String feed;
	
	public Animal() {;}

	public Animal(String name, int age, String feed) {
		super();
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	void walk() {
		System.out.println("걷기");
	}
	void run() {
		System.out.println("뛰기");
	}
	void eat() {
		System.out.println("먹기");
	}
}

class Lion extends Animal {	// Animal 클래스 상속
	public Lion() {;}
	void hunt() {
		System.out.println("샤냥하기");
	}
}
public class InheritanceTest02 {

}
