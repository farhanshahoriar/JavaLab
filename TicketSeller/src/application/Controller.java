package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
	@FXML
	public TextArea input1;
	@FXML
	public Label lebel2;
	@FXML
	public Label lebel3;
	
	int tickets=10;
	int tc;
	@FXML
	public void buyticket(ActionEvent event) {
			//String val=((Button)event.getSource()).getText();
			tc=Integer.parseInt(input1.getText());
			if(tc<=tickets&&tc<=4) {
				tickets=tickets-tc;
				lebel2.setText("Successful");
				
			}
			else {
				lebel2.setText("Try "+Math.min(4,tickets)+" or less tickets ");
			}
			
			if(tickets>0)lebel3.setText(tickets+" tickets remaining.");
			else lebel3.setText("Sold out");
	}

}
