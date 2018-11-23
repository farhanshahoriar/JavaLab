package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
	
	@FXML
	public TextArea display;
	
	int opr1=0,opr2=0;
	double res=0;
	String operator="";
	
	@FXML
	public void numpadaction(ActionEvent event) {
			String val=((Button)event.getSource()).getText();
			display.appendText(val);
	}
	
	@FXML
	public void operation(ActionEvent event) {
		String val=((Button)event.getSource()).getText();
		if(val.equals("C")) {
			display.setText("");
		}
		else if(val.equals("=")) {
			opr2=Integer.parseInt(display.getText());
			res=Model.calculate(opr1, opr2, operator);
			display.setText(String.valueOf(res));
			
		}
		else {
			operator=val;
			opr1=Integer.parseInt(display.getText());
			display.setText("");
			
		}
		
		//display.appendText(val);
	}
	
}
