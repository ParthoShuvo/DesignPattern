package context;

import strategyHelper.OperationAdd;
import strategyHelper.OperationMultiply;
import strategyHelper.OperationSubtract;

public class MainClass {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("Sum is " + context.executeStrategy(10, 20));
		context = new Context(new OperationSubtract());
		System.out.println("Subtract is " + context.executeStrategy(10, 20));
		context = new Context(new OperationMultiply());
		System.out.println("Multiplication is " + context.executeStrategy(10, 20));

	}

}
