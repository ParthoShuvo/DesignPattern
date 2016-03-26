package example2;

import java.util.ArrayList;

import example1.Enum;

public class IteratorEnumAdapter extends Iterable implements Enum {

	private int index = -1;
	private ArrayList<Object> arrayList;

	public IteratorEnumAdapter(ArrayList<Object> arrayList) {
		if (arrayList != null && arrayList.size() > 0) {
			index = 0;
			this.arrayList = arrayList;
		}
	}

	@Override
	public boolean hasNextElement() {
		if (hasNext()) {
			return true;
		}
		return false;
	}

	@Override
	public Object nextElement() {
		Object object = next();
		return object;
	}

	@Override
	public boolean hasNext() {
		if (index != -1 && index < arrayList.size()) {
			return true;
		}
		return super.hasNext();
	}

	@Override
	public Object next() {
		Object object = null;
		if (index != -1 && index < arrayList.size()) {
			object = arrayList.get(index);
			index++;
		}
		return object;
	}

}
