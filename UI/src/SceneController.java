import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void AddIngredientScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("AddIngredient.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
//        System.out.println("scene1");
    }

    public void ChangeIngredientScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ChangeIngredient.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
//        System.out.println("scene2");
    }

    public void IngredientScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("IngredientScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
//        System.out.println("scene2");
    }
}