package gptReview.a;

import java.util.Objects;

public class Person {
//	Person 클래스를 만들어 이름과 나이를 저장하고, 이를 출력하는 메서드를 정의하세요. 
//	main 메서드에서 Person 객체를 생성하고 출력까지 해보세요.
	
	public String name;
	public int age;	

	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(this);
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
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	
}
