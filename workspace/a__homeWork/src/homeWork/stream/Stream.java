package homeWork.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String> (Arrays.asList("민수", "지현", "수아", "준호"));
		
		students.forEach(System.out::println);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		
		numbers.stream().map(number -> number * number).forEach(numbers2::add);
		System.out.println(numbers2);
		
		
		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(3, 6, 7, 8, 10, 13));
		
		numbers3.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
		
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("alice", "Bob", "charlie", "David", "eve"));
		ArrayList<String> lowersNames = new ArrayList<String>();
		
		names.stream().filter(name -> Character.isUpperCase(name.charAt(0))).forEach(lowersNames::add);;
		lowersNames.stream().map(String::toLowerCase).forEach(System.out::println);
	}
	
}
