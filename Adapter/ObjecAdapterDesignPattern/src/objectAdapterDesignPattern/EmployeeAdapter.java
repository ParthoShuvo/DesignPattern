package objectAdapterDesignPattern;

import java.util.ArrayList;

import objectAdapterDesignPatternHelper.ITerget;

public class EmployeeAdapter implements ITerget {

	private ThirdPartyBillingSystem billingSys = new ThirdPartyBillingSystem();

	@Override
	public void processEmployeeSalary(String[][] employeeInfo) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		for (int i = 0; i < employeeInfo.length; i++) {
			Employee employee = new Employee();
			for (int j = 0; j < employeeInfo[i].length; j++) {
				switch (j) {
				case 0:
					employee.setEmpId(employeeInfo[i][j]);
				case 1:
					employee.setEmpName(employeeInfo[i][j]);
				case 2:
					employee.setDesignation(employeeInfo[i][j]);
				default:
					break;
				}

			}
			employees.add(employee);
		}
		billingSys.procesSalary(employees);

	}

}
