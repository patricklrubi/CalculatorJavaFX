import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
public class MainProcess {
	
	@FXML
	public Label res;
	
	//Will
	@FXML
	private double num1 = 0;
	
	@FXML
	private double num2;
	
	//Boolean used to denote the beginning of a calculation
	@FXML
	private boolean begin = true;
	
	//Used to store the operator
	@FXML
	private String operator = "";
	
	//Instance of Calculations Class. Used to calculate after numbers and operators
	@FXML
	private Calculations mod = new Calculations();
	
	
	
	public void processNumbers(ActionEvent event) {
		if (begin) {
			res.setText("");
			begin = false;
		}
		
		String val = ((Button)event.getSource()).getText();
		res.setText(res.getText() + val);
		
	}
	
	
	
	public void processOperators(ActionEvent event) {
		String val = ((Button)event.getSource()).getText();
		
		if (!val.equals("=")) {
			if (!operator.isEmpty()) 
				switch(val) {
				case "C":
					res.setText("");
					num1 = 0;
					num2 = 0;
					break;
				default: 
					break;
				
				}
				operator = val;
				num1 = Double.parseDouble(res.getText());
				res.setText("");
				return;
			
		}else {
				if (operator.isEmpty()) {
					return;
				}
				num2 = Double.parseDouble(res.getText());
				double output = mod.operation(num1, num2, operator);
				res.setText(String.valueOf(output));
				num1 = 0;
				num2 = 0;
				operator = "";
				begin = true;
			}
			
		}
		
		
	}

