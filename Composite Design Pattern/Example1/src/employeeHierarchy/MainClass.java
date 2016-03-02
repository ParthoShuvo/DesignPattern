package employeeHierarchy;

public class MainClass {
	public static void main(String[] args) {
		Employee CEO = new DepartmentHead("Shuvo", "CEO", 200000);
		Employee marketingHead = new DepartmentHead("Prasen", "Marketing", 100000);
		Employee salesHead = new DepartmentHead("Tonmoy", "Sales", 80000);
		CEO.addEmployee(marketingHead);
		CEO.addEmployee(salesHead);
		Employee staff1 = new Staff("abc", "Marketing", 50000);
		Employee staff2 = new Staff("cde", "Marketing", 50000);
		marketingHead.addEmployee(staff1);
		marketingHead.addEmployee(staff2);
		Employee staff3 = new Staff("abc", "Sales", 20000);
		Employee staff4 = new Staff("cde", "Sales", 20000);
		salesHead.addEmployee(staff3);
		salesHead.addEmployee(staff4);
		CEO.displayEmployeeInfo();
		
	}
}
