package classTest;

public class ClassTask12 {
//	화면
	
//	쿠팡(Cupang)
//	kg당 가격
	
//	박스(Box)
//	kg
	
//	쿠팡의 택배 서비스를 이용하고자 할 때
//	전달한 박스의 가격을 구한다.
	public static void main(String[] args) {
		Box box = new Box(2);	// 박스 무게 2
		Cupang cupang = new Cupang(2000);	// 키로당 2000원
		
		System.out.println(cupang.total);	// 총 택배의 가격
		
	}
}
