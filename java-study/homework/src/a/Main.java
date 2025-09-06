package a;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) { 
		ArrayList<Employee> employees = new ArrayList<>();

		int allSalary = 0;
		
		employees.add(new Manager("김매니저", 8000));
		employees.add(new Developer("이개발", 6500));
		employees.add(new Developer("박주니어", 4500));
		
		for (int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);			
			employee.printInfo();
			employee.doWork();
			
			if (employee instanceof Developer) {
				((Developer)employee).writeCode();
				System.out.println("");
				
			}else {
				((Manager)employee).manageTeam();
				System.out.println("");
				
			}
		}
		System.out.println("\uD83D\uDCB0 급여 6000 이상 직원:  ");
		employees.stream().filter(employee -> employee.getSalary() >= 6000).map(Employee::getName).forEach(System.out::println);
		System.out.println("");

		System.out.println("📊 평균 급여: ");
		double avg =  employees.stream().mapToInt(Employee::getSalary).average().orElse(0);
		System.out.println(avg);

	}
}
