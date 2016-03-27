package observerdesignpattern;

public class NewsSubscriber implements Observer {

	public NewsSubscriber() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(String news) {
		// TODO Auto-generated method stub
		System.out.println(news);

	}

}
