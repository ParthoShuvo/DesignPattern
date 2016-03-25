package Example1;

public class DonaldDuck extends Duck {

	private DonaldDuck() {
		
	}
	
	public static Duck getInstance(){
		if(duck == null){
			synchronized (DonaldDuck.class) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
				if(duck == null){
					duck = new DonaldDuck();
				}
			}
		}
		return duck;
	}

	
}
