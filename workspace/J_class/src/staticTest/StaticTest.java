package staticTest;

class Data{
	int data;
	static int data_s = 10;
	
	public Data() {;}

	public Data(int data) {
		this.data = data;
	}
	
	void increase() {
		System.out.println(++data);
	}
	
	static void increase_s() {
		System.out.println(++data_s);
	}
	
}

public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data(10);
		Data data2 = new Data();
		
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		
		data2 = new Data();	// 계속 이어짐
		
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		
		
		
		
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		
		data1 = new Data(10);	// 다시 초기화
		
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
	}
}






















