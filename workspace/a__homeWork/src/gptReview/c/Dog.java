package gptReview.c;

public class Dog extends Animal{
//	생성자에서 super(name)을 사용해서 부모 필드 초기화
//	makeSound() 메서드를 오버라이딩하여 "멍멍!" 출력
//	introduce() 메서드도 오버라이딩하고,
//	super.introduce() 호출 후 "개입니다."라는 문장 추가 출력
	
	public Dog() {;}
	
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
		public void makeSound() {
			System.out.println("멍멍");
		}
	
	@Override
		public void introduce() {
			super.introduce();
			System.out.println("개입니다.");
		}
}
