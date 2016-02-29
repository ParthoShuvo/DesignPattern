package classAdapterDesignPatten;

public class HumanResourceSystem {

	public static String[][] getEmployees() {
		String[][] employees = new String[3][];
		employees[0] = new String[] { "100", "A", "Team Leader" };
		employees[1] = new String[] { "101", "B", "Developer" };
		employees[2] = new String[] { "102", "C", "Tester" };
		return employees;
	}
	
	public static void processSalary(){
		EmployeeAdapter employeeAdapter = new EmployeeAdapter();
		employeeAdapter.processEmployeeSalary(getEmployees());
	}
}
