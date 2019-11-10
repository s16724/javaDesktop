package source;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Controller {
    @FXML
    private AnchorPane rootPane;

    public void bmiButton(Event evt) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("BmiGUI.fxml"));
        rootPane.getChildren().setAll(pane);


        /*Scene paneScene = new Scene(pane);
        Stage window= (Stage)((Node)evt.getSource()).getScene().getWindow();
        window.setScene(paneScene);
        window.show();*/

    }

    public void addIngredientButton(Event evt) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("AddIngrediementGUI.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void dietPlanButton(Event evt) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("DietPlanGUI.fxml"));
        rootPane.getChildren().setAll(pane);

    }
}
