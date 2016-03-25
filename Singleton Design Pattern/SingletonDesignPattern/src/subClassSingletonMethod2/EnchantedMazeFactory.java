package subClassSingletonMethod2;

public class EnchantedMazeFactory extends MazeFactory {
	
	private EnchantedMazeFactory(){
		System.out.println("Enchanted Maze factory has been created");
	}
	
	public static MazeFactory getInstance(){
		if(factory == null){
			factory = new EnchantedMazeFactory();
		}
		return factory;
	}
}
