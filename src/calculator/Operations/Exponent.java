package calculator.Operations;

import calculator.Operation;

public class Exponent extends Operation {
	private static final long serialVersionUID = 1L;
	
	
	public Exponent() {
		super("Exponent");
	}


	@Override
	public Float action() 
	{
		return (float) Math.pow(this.getFirstNumber(), this.getSecondNumber());
	}

}