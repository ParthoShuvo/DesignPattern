package example1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEnumAdapter implements Enum{

	private Iterator<Object> iterator = null;
	
	
	public IteratorEnumAdapter(ArrayList<Object> arrayList) {
		if(arrayList != null && arrayList.size() > 0){
			iterator = arrayList.iterator();
		}
	}
	
	
	@Override
	public boolean hasNextElement() {
		if(iterator.hasNext()){
			return true;
		}
		return false;
	}

	@Override
	public Object nextElement() {
		Object object = iterator.next();
		return object;
	}
	
	
	
	
}
