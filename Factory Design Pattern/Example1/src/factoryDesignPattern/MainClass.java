package factoryDesignPattern;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String args[]){
		Factory factory = new Factory();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String choice;
		System.out.println("Choose shape among: circle/square/rectangle");
		choice = scanner.nextLine();
		Shape shape = factory.makeShape(choice);
		shape.draw();
		
	}
}
