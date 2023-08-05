import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application{

	public void start(Stage priStage) {
		//Setting Stage and scene for application
		try {
			Parent init = FXMLLoader.load(getClass().getClassLoader().getResource("CalculatorController.fxml"));
			Scene priScene = new Scene(init, 300, 375);
			priStage.setTitle("Eclipse/SceneBuilder Calculator");
			priStage.setScene(priScene);
			priStage.show();
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
