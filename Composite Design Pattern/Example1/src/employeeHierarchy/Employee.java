package employeeHierarchy;

public abstract class Employee {

	protected String name;
	protected String department;
	protected int salary;

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	protected String getName() {
		return name;
	}

	protected String getDepartment() {
		return department;
	}

	protected int getSalary() {
		return salary;
	}

	protected void addEmployee(Employee employee) {
		throw new UnsupportedOperationException();
	}

	protected void removeEmployee(Employee employee) {
		throw new UnsupportedOperationException();
	}

	protected Employee getEmployee(int employeeInd) {
		throw new UnsupportedOperationException();
	}

	protected void displayEmployeeInfo() {
		System.out.println("Name: " + getName() + " Department: " + getDepartment() + " Salary: " + getSalary());
	}

}