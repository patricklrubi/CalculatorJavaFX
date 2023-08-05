import javafx.scene.control.Label;

public class Calculations {

	//Basic Calculations
	public double operation(double num1, double num2, String operator) {
		switch(operator) {
		case "+":
			return num1 + num2;

		case "-":
			return num1 - num2;
			
		case "x":
			return num1 * num2;
			
		case "%":
			if (num2 == 0) {
				return 0; //Dividing by Zero
			}
			return num1 / num2;
			
		default: 
			return 0;
	}
}
}
