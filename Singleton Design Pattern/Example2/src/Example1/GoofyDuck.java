package Example1;

public class GoofyDuck extends Duck {

	
	
	private GoofyDuck() {
		
	}
	
	public static Duck getInstance(){
		if(duck == null){
			synchronized (GoofyDuck.class) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
				if(duck == null){
					duck = new GoofyDuck();
				}
			}
		}
		return duck;
	}
	
	

}
