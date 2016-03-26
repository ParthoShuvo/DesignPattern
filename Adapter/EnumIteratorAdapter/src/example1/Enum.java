package example1;

import java.util.ArrayList;
import java.util.Enumeration;

public class Enum implements Enumeration<Object>{

	private ArrayList<Object> arrayList = null;
	private int index = -1;
	
	public Enum(ArrayList<Object> arrayList){
		if(arrayList != null && !arrayList.isEmpty()){
			index = 0;
			this.arrayList = arrayList;
		}
	}
	
	@Override
	public boolean hasMoreElements() {
		if(index != -1 && index < arrayList.size()){
			return true;
		}
		return false;
	}

	@Override
	public Object nextElement() {
		Object object = null;
		if(index != -1 && index < arrayList.size()){
			object = arrayList.get(index);
			index++;
		}
		return object;
	}

}
