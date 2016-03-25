package subClassSingletonMethod2;

public class AgentMazeFactory extends MazeFactory {

	private AgentMazeFactory() {
		System.out.println("Agent Maze factory has been added");
	}
	
	public static MazeFactory getInstance(){
		if(factory == null){
			factory = new AgentMazeFactory();
		}
		return factory;
	}
}
