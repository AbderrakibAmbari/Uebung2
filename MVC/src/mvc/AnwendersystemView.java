package mvc;

import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AnwendersystemView {
	private AnwendersystemControl anwControl;
	private AnwendersystemModel anwModel;

	private GridPane grid = new GridPane();
	private TextField txtfl = new TextField();
	private Button btnTest = new Button("Test");

	public AnwendersystemView(AnwendersystemControl anwControl, Stage primaryStage, AnwendersystemModel anwModel) {
		this.anwControl = anwControl;
		this.anwModel = anwModel;
		this.grid.setAlignment(Pos.CENTER);
		this.grid.setHgap(10);
		this.grid.setVgap(10);
		this.grid.setPadding(new Insets(25,25,25,25));
		primaryStage.setTitle(
				this.anwModel.getUeberschrift());
		Scene scene =new Scene(grid,350,150);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
