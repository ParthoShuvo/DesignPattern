package classAdapterDesignPatten;

import java.util.ArrayList;

import classAdapterDesignPatternHelper.ITerget;

public class EmployeeAdapter extends ThirdPartyBillingSystem implements ITerget {

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
		procesSalary(employees);

	}

}
