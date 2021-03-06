package defaultPackage;

public class Employee {
	
	private String employeeName;
	private String designation;
	private String salary;
	
	public Employee(String employeeName, String designation, String salary) {
		this.employeeName = employeeName;
		this.designation = designation;
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public String getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + getEmployeeName() + " Designation: " + getDesignation() + 
				" Salary: " + getSalary();
	}

}
