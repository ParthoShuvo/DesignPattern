package mvcdesignpattern;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {

	private JTextField firstNumTxtField = new JTextField(10);
	private JTextField secondNumTxtField = new JTextField(10);
	private JLabel addLabel = new JLabel("+");
	private JButton addBtn = new JButton("Calculate");
	private JTextField resultTxtField = new JTextField(10);

	public CalculatorView() throws HeadlessException {
		JPanel panel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setSize(600, 200);
		panel.add(firstNumTxtField);
		panel.add(addLabel);
		panel.add(secondNumTxtField);
		panel.add(addBtn);
		panel.add(resultTxtField);
		this.add(panel);
	}

	public int getFirstNumber() {
		return Integer.parseInt(firstNumTxtField.getText().toString());
	}

	public int getSecondNumber() {
		return Integer.parseInt(secondNumTxtField.getText().toString());
	}

	public void setCalculation(int val) {
		resultTxtField.setText(String.valueOf(val));
	}

	public void addCalculationBtnListener(ActionListener actionListener) {
		addBtn.addActionListener(actionListener);
	}

	public void displayErrorMsg(String errMsg) {
		JOptionPane.showMessageDialog(this, errMsg);
	}

}