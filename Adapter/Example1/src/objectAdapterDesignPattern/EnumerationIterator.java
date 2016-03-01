package objectAdapterDesignPattern;

import java.util.Iterator;

import defaultPackage.Employee;
import defaultPackage.Enumeration;

public class EnumerationIterator implements Enumeration {

	private Iterator<Employee> employeeIterator;

	public EnumerationIterator(Iterator<Employee> newEmployeeIterator) {
		employeeIterator = newEmployeeIterator;
	}

	@Override
	public boolean hasMoreElement() {
		
		return employeeIterator.hasNext();

	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return employeeIterator.next();
	}

}
