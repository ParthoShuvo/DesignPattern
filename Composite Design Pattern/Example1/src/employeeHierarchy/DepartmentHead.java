package employeeHierarchy;

import java.util.ArrayList;
import java.util.Iterator;

public class DepartmentHead extends Employee {

	private ArrayList<Employee> employeeList = new ArrayList<Employee>();

	public DepartmentHead(String name, String department, int salary) {
		super(name, department, salary);
	}

	@Override
	protected void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	protected void removeEmployee(Employee employee) {
		employeeList.remove(employee);
	}

	@Override
	protected Employee getEmployee(int employeeInd) {
		return employeeList.get(employeeInd);
	}
	
	@Override
	protected void displayEmployeeInfo() {
		// TODO Auto-generated method stub
		System.out.println("Deptartment Head");
		super.displayEmployeeInfo();
		Iterator<Employee> iterator = employeeList.iterator();
		while(iterator.hasNext()){
			Employee employee = iterator.next();
			employee.displayEmployeeInfo();
		}
	}

}
