package subClassSingletonMethod2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazeFactory mazeFactory = EnchantedMazeFactory.getInstance();
		mazeFactory = AgentMazeFactory.getInstance();
	}

}
