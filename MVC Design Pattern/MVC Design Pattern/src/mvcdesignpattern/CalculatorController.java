package mvcdesignpattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	private CalculatorModel cModel;
	private CalculatorView cView;

	public CalculatorController(CalculatorModel cModel, CalculatorView cView) {
		this.cModel = cModel;
		this.cView = cView;
		this.cView.addCalculationBtnListener(new CalculatorListener());
	}

	private class CalculatorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int firstNum = 0;
			int secondNum = 0;
			try {
				firstNum = cView.getFirstNumber();
				secondNum = cView.getSecondNumber();
				cModel.addTwoNumber(firstNum, secondNum);
				cView.setCalculation(cModel.getCalculation());
			} catch (NumberFormatException e) {
				cView.displayErrorMsg(e.getMessage());
			}

		}

	}

}
