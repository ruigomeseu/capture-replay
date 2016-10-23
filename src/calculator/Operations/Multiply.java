package calculator.Operations;

import calculator.Operation;

public class Multiply extends Operation {
	
private static final long serialVersionUID = 1L;
	
	public Multiply()
	{
		super("Multiply");
	}
	
	
	public Float action()
	{
		if(!this.isNumber(this.firstNumber.getText()) || !this.isNumber(this.secondNumber.getText()))
			return null;
		
		return this.getFirstNumber() * this.getSecondNumber();
	}

}
