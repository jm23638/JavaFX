//Jonathan Moya Quiroz

import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class Team extends Application {
	@Override
	public void start(Stage primaryStage) {
		int groupS = 0;
		int teamS = 0;
		String inputPe;
		String inputPl;
		
		TextInputDialog inputDialog = new TextInputDialog();
		inputDialog.setTitle("Number of People");
		inputDialog.setHeaderText("Enter Number");
		inputDialog.setContentText("Enter The Number of Anthelets!(at least 3)");
		Optional<String> enteredP = inputDialog.showAndWait();
		inputPe = enteredP.get();
		int numPeople = Integer.parseInt(inputPe);
		
		if ( numPeople>=10) {
			groupS = numPeople/2;
		} else if ( 3<=numPeople && numPeople<10) {
			groupS = numPeople/3;
		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("Can't you read the instructions!? has to be at least 3!");
			alert.showAndWait();
			
		}		
		Alert alert12 = new Alert(AlertType.INFORMATION);
		alert12.setTitle("You did it!");
		alert12.setContentText("The number of people is " + numPeople + "\n" + "Group size is " + groupS);
		alert12.showAndWait();
		
		TextInputDialog dialogNaruto = new TextInputDialog();
		dialogNaruto.setTitle("Number of Athelets");
		dialogNaruto.setHeaderText("Enter Number");
		dialogNaruto.setContentText("Enter The Number of athelets!");
		Optional<String> sasuke = dialogNaruto.showAndWait();
		inputPl = sasuke.get();
		int numPl = Integer.parseInt(inputPl);
		
		if (11<=numPl && numPl<=55 ) {
				teamS = numPl/11;
		} else { 
				teamS = 1;
		}
		Alert sakura = new Alert(AlertType.INFORMATION);
		sakura.setTitle("What is going to work? Team work!!");
		sakura.setContentText("The number of players is " + numPl + "\n" + "Group size is " + teamS);
		sakura.showAndWait();
	}

}
		
