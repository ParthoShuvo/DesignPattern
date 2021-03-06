package example2;

import java.util.ArrayList;
import java.util.Iterator;

import example1.Student;

public class DemoAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> studentList = new ArrayList<Object>();
		Student student = new Student("Shuvo", "13-01-04-115", "CSE");
		studentList.add(student);
		student = new Student("Rasel", "13-01-04-119", "CSE");
		studentList.add(student);
		student = new Student("Likhon", "13-01-04-113", "CSE");
		studentList.add(student);
		Iterator<Object> iterator = new EnumIteratorAdapter(studentList);
		while (iterator.hasNext()) {
			student = (Student) iterator.next();
			System.out.println("Name: " + student.getName() + " ID: " + student.getID() + 
					" Department: " + student.getDept());
		}
	}

}
