package mvcdesignpattern;

public class CalculatorModel {

	private int sum;

	public CalculatorModel() {

	}

	public void addTwoNumber(int a, int b) {
		sum = a + b;
	}

	public int getCalculation() {
		return sum;
	}
}
