package classAdapterDesignPatten;

import java.util.ArrayList;

public class ThirdPartyBillingSystem {

	public void procesSalary(ArrayList<Employee> employeeList) {
		for (Employee employee : employeeList) {
			if (employee.getDesignation().equalsIgnoreCase("Tester")) {
				System.out.println("Tester salary is " + 20000);
			}
			else if (employee.getDesignation().equalsIgnoreCase("Developer")) {
				System.out.println("Developer salary is " + 50000);
			}
			else if (employee.getDesignation().equalsIgnoreCase("Team Leader")) {
				System.out.println("Team Leader salary is " + 70000);
			}
		}
	}

}
