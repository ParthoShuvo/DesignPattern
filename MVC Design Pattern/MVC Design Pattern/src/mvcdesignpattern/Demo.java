package mvcdesignpattern;

public class Demo {

	public static void main(String[] args) {
		CalculatorView cView = new CalculatorView();
		CalculatorModel cModel = new CalculatorModel();
		CalculatorController cCont = new CalculatorController(cModel, cView);
		cView.setVisible(true);

	}

}
