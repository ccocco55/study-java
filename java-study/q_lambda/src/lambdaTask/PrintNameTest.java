package lambdaTask;

public class PrintNameTest {   
	
	void printFullName(PrintName printName, String fristName, String lastName) {
		System.out.println(printName.getFullName(fristName, lastName));
	}
	
	public static void main(String[] args) {
		PrintNameTest printNameTest = new PrintNameTest();
		printNameTest.printFullName((f, l) -> l + f, "채민", "임");	// 람다식
	}
}
