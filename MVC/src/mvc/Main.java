package mvc;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		new AnwendersystemControl(primaryStage);
		
		
		
		/*primaryStage.setTitle("Anwendersystem");
		primaryStage.setScene(anwView.getScene());
		primaryStage.show();
		
		*/
	}

}
