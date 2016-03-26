package example2;

import java.util.ArrayList;
import java.util.Iterator;

import example1.Enum;

public class EnumIteratorAdapter extends Enum implements Iterator<Object> {

	public EnumIteratorAdapter(ArrayList<Object> arrayList) {
		// TODO Auto-generated constructor stub
		super(arrayList);

	}

	@Override
	public boolean hasNext() {
		return hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return nextElement();
	}

}
