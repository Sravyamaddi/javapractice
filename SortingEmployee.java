package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface Company {

	static List<Employee> getEmployees() {
		List<Employee> listofEmployees = new ArrayList<>();
		listofEmployees.add(new Employee("Sravya", "Development"));
		listofEmployees.add(new Employee("Kiruba", "QA"));
		Collections.sort(listofEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));//sort by Name
		// or Collections.sort(listofEmployees, new EmployeeCompatator());
		// Collections.sort(listofEmployees, Collections.reverseOrder());
		return listofEmployees;
	}

}

public class SortingEmployee implements Company {
	
	public static String DEVELOPER = "Development";
	public static String TESTER =  "QA";

	public static void main(String[] args) {
		
		List<Employee> employeeList =  Company.getEmployees();

		Employee e1 = new Employee("sravya", DEVELOPER);
		Employee e2 = new Employee("sravya", TESTER);
		
		System.out.println(e1.equals(e2)); //true as equal method overridden with employee name & department
		
		// filtering the developers in the employee data
		List<Employee> developerList = employeeList.stream().filter(e -> e.getDepartment().equalsIgnoreCase(DEVELOPER)).collect(Collectors.toList());
		
		Map<Employee, String> employeeMap = new HashMap<>();
		employeeMap.put(e1, "dep1");
		employeeMap.put(e2, "dep2");
		
		long departmentCount = employeeMap.values().stream().distinct().count();
		
		System.out.println("developerList : " + developerList.size() + "departmentCount : " + departmentCount);
		
	}

}

class EmployeeCompatator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
