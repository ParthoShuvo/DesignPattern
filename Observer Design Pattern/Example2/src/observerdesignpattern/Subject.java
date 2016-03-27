package observerdesignpattern;

public interface Subject {
	
	public void registerObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObserver(String news);
	
	public void measurementChanged();
	
	
	
}
