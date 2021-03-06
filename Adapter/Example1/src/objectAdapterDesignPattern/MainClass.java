package objectAdapterDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

import defaultPackage.Employee;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee employee = new Employee("Shuvojit", "Software Engineer", "100000");
		employeeList.add(employee);
		employee = new Employee("Shuvo", "Team Leader", "1500000");
		employeeList.add(employee);
		employee = new Employee("Partho", "Project Manager", "200000");
		employeeList.add(employee);
		Iterator<Employee> employeeIterator = employeeList.iterator();
		EnumerationIterator enumerationIterator = new EnumerationIterator(employeeIterator);
		while(enumerationIterator.hasMoreElement()){
			employee = (Employee) enumerationIterator.nextElement();
			System.out.println(employee.toString());
		}
		
	
		
	

	}

}
