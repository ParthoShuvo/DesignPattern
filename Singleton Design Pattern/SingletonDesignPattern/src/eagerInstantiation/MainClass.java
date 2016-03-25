package eagerInstantiation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton  singleton = Singleton.getInstance();
		singleton.setData(20);
		System.out.println(singleton.getData());
		System.out.println("Singleton intance left the instance of singleton class");
		singleton = Singleton.getInstance();
		System.out.println(singleton.getData());
	}

}
