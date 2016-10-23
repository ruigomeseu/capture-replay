package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class Operation extends JPanel{
	private static final long serialVersionUID = 1L;

	protected JTextField firstNumber ;
	protected JTextField secondNumber ;
	protected JTextField result ;
	protected JButton runButton ;
	
	private String operationType;
	
	public Operation(String type)
	{
		this.operationType = type;
		
		this.initElements(type);
		
		this.configButton();
		
		this.addElements();

		this.setVisible(true);
	}
	
	private void initElements(String type){
		this.firstNumber = new JTextField(5);
		this.secondNumber = new JTextField(5);
		this.result = new JTextField("Result", 10);
		
		this.runButton = new JButton(type);
		runButton.setBounds(130,100,100, 40); 
	}
	
	private void addElements(){
		this.add(this.firstNumber);
		this.add(this.secondNumber);
		this.add(this.result);
		this.add(this.runButton);
	}
	
	private void configButton(){
		this.runButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					Float operationResult = action();
					
					if(operationResult != null)
						result.setText(operationResult.toString());
					else
						result.setText("ERROR");
					
				}catch(Exception exception)
				{
					System.exit(ERROR);
				}
			}
		});
	}
	
	/** 
	 * **
	 * @return Null if not allowed operation. Result if operation allowed.
	 */
	public abstract Float action();
	
	public Float getFirstNumber(){
		return Float.parseFloat(this.firstNumber.getText());
	}
	public Float getSecondNumber(){
		return Float.parseFloat(this.secondNumber.getText());
	}
	

	public void addToPanel(JPanel panel)
	{		
		panel.add(this.operationType, this);
	}
	
	
	

	/** POSSIBLE SOLUTION **/
	public boolean isNumber(String string){
		try {
			Float.parseFloat(string);
		} catch (Exception e) {
		    return false;
		}
		return true;
	}
	
}
