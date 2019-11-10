package source;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("StartGUI.fxml"));
        primaryStage.setTitle("KcaP");
        primaryStage.setScene(new Scene(root, 600, 400));
       /* primaryStage.setMaxHeight(400);
        primaryStage.setMaxWidth(600);*/
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
