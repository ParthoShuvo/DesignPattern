package subClassSingletonMethod2;

public abstract class MazeFactory {
	
	protected static MazeFactory factory = null;
	
	protected MazeFactory(){
		
	}
	
	public static MazeFactory getInstance(){
		return null;
	}
}
