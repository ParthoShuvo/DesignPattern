package example1;

public class Student {

	private String name;
	private String ID;
	private String dept;
	
	
	public Student(String name, String iD, String dept) {
		this.name = name;
		ID = iD;
		this.dept = dept;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
}
