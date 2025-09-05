package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class StreamTest {
	
//	가변인자
//	외부에서 전달받을 값을 제한하지 않을 때 사용한다.
//	사실 배열과 동일하지만, 전달받는 문법에 차이가 있다.
//	public static void test(int... datas) {
//		for (int i = 0; i < datas.length; i++) {
//			System.out.println(datas[i]);
//		}
//	}
	
	public int getDoubleTime(int data) {
		return data * 2;
	}
	
	
	public static void main(String[] args) {
//		StreamTest.test(1,2,3,4,5,6,7,8);
		
//		배열을 ArrayList로 변경하는 방법
//		Integer[] arData = {10, 20, 30, 40, 50}; 
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
		
//		ArrayList를 배열로 변경하는 방법
//		Object[] arData = null;
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		arData = datas.toArray();
		
//		System.out.println(datas);
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		IntStream: 정수를 다루는 Stream API
//		forEach(): 반복
//		여러 값을 가지고 있는 컬렉션 객체 또는 Stream API에서 forEach 메소드를 사용할 수 있다.
//		forEach() 메소드에는 Consumer 인터페이스 타입의 값(구현체)을 전달해야 한다.
//		Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//		컬렉션 객체 또는 Stream 객체 안에 있는 값들이 매개변수에 순서대로 담기고,
//		화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
//		IntStream.rangeClosed(1, 10).forEach((data) -> {System.out.println(data);});
		
//		10 ~ 100까지 출력
//		IntStream.rangeClosed(10, 100).forEach((data) -> {System.out.println(data);});
		
//		ArrayList<String> colors = new ArrayList<String>(Arrays.asList("검은색", "빨간색", "녹색"));
//		colors.forEach((color) -> {System.out.println(color);});
		
//		참조형
//		1 ~ 10까지 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		Consumer<Integer> addConsumer = datas::add;
//		Consumer<Integer> printlnConsumer = System.out::println;
//		
//		IntStream.range(1, 11).forEach(addConsumer::accept);
//		datas.forEach(printlnConsumer::accept);
//		IntStream.range(1, 11).forEach(datas::add);
//		datas.forEach(System.out::println);
		
//		map(): 변경
//		1 ~ 10까지 ArrayList에 담고 각 값에 2를 곱하여 출력한다.
//		StreamTest streamTest = new StreamTest();
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		IntStream.range(1, 11).forEach((data) -> {datas.add(data);});
//		datas.stream().map((data) -> data * 2).forEach((data) -> {System.out.println(data);});
		
//		IntStream.range(1, 11).forEach(datas::add);
		
//		datas.stream().map((data) -> data * 2).forEach(System.out::println);
//		datas.stream().map(streamTest::getDoubleTime).forEach(System.out::println);
		
//		filter(): 조건
//		10 ~ 1까지 ArrayList에 담은 후 짝수만 출력한다.
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).map((data) -> 10 - data).forEach((data) -> {datas.add(data);});
//		datas.stream().filter((data) -> data % 2 == 0).forEach((data) -> {System.out.println(data);});
		
//		심화
		User[] arUser = {
				new User(1, "한동석", 20),
				new User(2, "김신영", 19)
		};
		
		ArrayList<User> users = new ArrayList<User>(Arrays.asList(arUser));
		
//		만 나이를 계산한다.
//		users.stream().map((user) -> user.getAge() - 1).forEach((age) -> {System.out.println(age);});
//		users.stream().map((user) -> user.getLowerAge()).forEach((age) -> {System.out.println(age);});
//		users.stream().map(User::getLowerAge).forEach((age) -> {System.out.println(age);});
		
//		미성년자만 정보 출력
//		users.stream().filter((user) -> user.getAge() < 20).forEach((user) -> {System.out.println(user);});
//		users.stream().filter(User::isTeen).forEach((user) -> {System.out.println(user);});
		
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach(datas::add);
//		
//		Collections.shuffle(datas);
//		
////		오름차순
//		datas.stream().sorted().forEach(System.out::println);
////		내림차순
//		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		collect(): 결과를 다양한 타입으로 리턴해준다.
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach(datas::add);
		
//		결과를 List로 리턴: Collectors.toList()
//		List<Integer> results = datas.stream().map((data) -> data * 2).collect(Collectors.toList());
//		System.out.println(results);
		
//		결과를 문자열로 리턴: Collectors.joining(String sep)
//		각 요소를 전달한 구분점으로 연결해서 문자열로 리턴해준다.
//		아무것도 전달하지 않으면 그대로 연결된다.
//		String results = datas.stream().map((data) -> String.valueOf(data * 2)).collect(Collectors.joining(","));
//		System.out.println(results);
		
		Function<String, Animal> generater1 = Animal::new;
		BiFunction<String, Integer, Animal> generater2 = Animal::new;
		TriFunction<String, Integer, String, Animal> generater3 = Animal::new;
		
		Animal dog1 = generater1.apply("강아지");
		Animal cat1 = generater1.apply("고양이");
		
		Animal dog2 = generater2.apply("강아지", 3);
		Animal cat2 = generater2.apply("고양이", 5);
		
		Animal dog3 = generater3.apply("강아지", 3, "수컷");
		Animal cat3 = generater3.apply("고양이", 5, "암컷");
		
		System.out.println(dog1);
		System.out.println(cat1);
		
		System.out.println(dog2);
		System.out.println(cat2);
		
		System.out.println(dog3);
		System.out.println(cat3);
	}
}
















