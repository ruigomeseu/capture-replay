package calculator;

import java.awt.GridLayout;
import javax.swing.*;

import calculator.Operations.Division;
import calculator.Operations.Exponent;
import calculator.Operations.Multiply;
import calculator.Operations.Subtract;
import calculator.Operations.Sum;  

public class Calculator extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private Sum sumOperation;
	private Subtract subtractOperation;
	private Division divisionOperation;
	private Multiply multiplyOperation;
	private Exponent exponentOperation;

	private JPanel controlPanel;

	public Calculator(){
		super();
		
		this.initPanel();
		
		this.addElements();
		
		this.initConfigurations();
	}
	
	public void initPanel(){
		this.controlPanel = new JPanel();
		this.controlPanel.setLayout(new GridLayout(3,2));
	}
	
	public void addElements()
	{
		this.addOperationsToCalculatorPanel(this.controlPanel);
		this.add(this.controlPanel);
	}
	
	public void initConfigurations(){
		this.setSize(400,500); 
		this.setVisible(true);
		this.controlPanel.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addOperationsToCalculatorPanel(JPanel panel){
		// Create sum operation and add it to panel
		this.sumOperation = new Sum();
		this.sumOperation.addToPanel(panel);
		
		// Create subtract operation and add it to panel
		this.subtractOperation = new Subtract();
		this.subtractOperation.addToPanel(panel);

		this.divisionOperation = new Division();
		this.divisionOperation.addToPanel(panel);
		

		this.multiplyOperation = new Multiply();
		this.multiplyOperation.addToPanel(panel);
		

		this.exponentOperation = new Exponent();
		this.exponentOperation.addToPanel(panel);
	}
}  