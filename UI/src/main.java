import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.json.*;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class main extends Application {

    @Override
    public void start(Stage stage) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("IngredientScene.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readInfomation st = new readInfomation();
        JSONArray jsonArr = st.getData("users");
        System.out.println(jsonArr);
//        userObjectMap userObjMap= new userObjectMap();
//        userObjMap.addObjectMap(jsonArr);
//        launch(args);
    }
}
