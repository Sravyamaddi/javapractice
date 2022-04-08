package practice;

public class Employee {

	private String name;
	private String department;
	
	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
		if (name == null) {
			if (employee.name != null)
				return false;
		} else if (!name.equals(employee.name))
			return false;
		else if (name.equals(employee.name) && department.equals(employee.department))
			return true;
		return true;
	}
	
}
