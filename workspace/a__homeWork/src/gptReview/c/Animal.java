package gptReview.c;

import java.util.Objects;

public class Animal {	
//	String name 필드
//	생성자: 이름을 초기화
//	메서드 makeSound() → "동물이 소리를 낸다" 출력
//	메서드 introduce() → "이 동물의 이름은 ~~입니다" 출력
	
	protected String name;
	
	public Animal() {;}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println("동물이 소리를 낸다");
	}
	
	public void introduce() {
		System.out.println("이 동물의 이름은 " + name + "입니다");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
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
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
