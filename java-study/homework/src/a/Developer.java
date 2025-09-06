package a;

public class Developer extends Employee{

	public Developer(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doWork() {
		System.out.println(name + "은(는) 코딩을 합니다.");
		
	}

	public void writeCode() {
		System.out.println(name + "이(가) 코드를 작성합니다.");
	}
	

}
