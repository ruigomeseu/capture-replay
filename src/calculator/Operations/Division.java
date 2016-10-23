package calculator.Operations;

import calculator.Operation;

public class Division extends Operation {
	private static final long serialVersionUID = 1L;
	
	
	public Division() {
		super("Division");
	}


	@Override
	public Float action() 
	{
		return this.getFirstNumber() / this.getSecondNumber();
	}

}
