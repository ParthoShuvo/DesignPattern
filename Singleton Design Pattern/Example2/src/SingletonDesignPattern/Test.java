package SingletonDesignPattern;

public class Test {

	public static void main(String[] args) {

		Test test = new Test();
		Package pkg = test.getClass().getPackage();

		Duck duck = Duck.getInstance(pkg.getName() + ".DonaldDuck");
		System.out.println(duck);
		Duck duck2 = Duck.getInstance(pkg.getName() + ".GoofyDuck");
		System.out.println(duck2);

	}

}
