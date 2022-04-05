package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

interface Company {

	abstract List<Employee> employeeInfo();

	static List<Employee> basicinfo() {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Sravya", "Development"));
		list.add(new Employee("Kiruba", "QA"));
		Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		Map<String, String> employeeMap = new HashMap<>();
		employeeMap.put("Sravya", "Development");
		employeeMap.put("Kavya", "tester");

		/*
		 * employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(
		 * System.out :: println); //filter( c ->
		 * c.getKey().startsWith("s").collect(Collectors.toList());
		 */

		Employee e1 = new Employee("sravya", "d1");
		Employee e2 = new Employee("sravya", "d2");
		HashMap<Employee, String> map = new HashMap<>();

		map.put(e1, "dsa");
		map.put(e2, "sd");

		System.out.println(e1.equals(e2));
		System.out.println(e1 == e2);
		System.out.println(map.size());

		List<String> students = new ArrayList<>();
		// students.stream().flatmap( String :: phones ).collect(Collectors.toList())
		students.stream().map(i -> {
			if (Integer.valueOf(i) % 2 != 0) {
				return i;
			} else {
				return (i + 1);
			}
		}).collect(Collectors.toList());

		return list;
	}

}

public class Test {

	public static void main(String[] args) {

		int n = 15;
		// Company company = () -> {return Company.basicinfo() ; };
		int a[] = new int[n];
		// int i= 0;
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}

		// Arrays.fill(a, 0, n-1, i++ );
		// for(int a1 :a)
		// System.out.println(a1);

		Singelton s;
		try {
			s = new Singelton();
			s = Singelton.getInstance();
			System.out.println(s.toString());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String args) {

		Company.basicinfo();
	}

}

class EmployeeCompatator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
