import javafx.scene.layout.*;
import org.json.*;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.util.Map;

public class main extends Application {

    private static Stage appStage;
    private static Scene currentScene;
//    private static Map<Scene, Scene> prevSceneMap;
    private static int sceneHeight;
    private static int sceneWidth;

    @Override
    public void start(Stage appStage) throws Exception {
        sceneHeight = 900;
        sceneWidth = 1600;
        main.appStage = appStage;
        Button bti1 = new Button("Xin dấu");
        Button bti2 = new Button("Xường Trinh");
        GridPane gP = new GridPane();
        gP.setVgap(50);
        gP.setHgap(120);
//        gP.setLayoutX(130);
//        gP.setLayoutY(280);
        gP.add(bti1, 0, 0);
        gP.add(bti2, 1, 0);
        currentScene = new Scene(gP, sceneWidth,sceneHeight);
//        prevSceneMap = new HashMap<Scene, Scene>();
        appStage.setTitle("Café App");
        appStage.setScene(currentScene);
        appStage.show();
    }
    public static void main(String[] args) {
        readInfomation st = new readInfomation();
        JSONArray jsonArr = st.getData();
        userObjectMap userObjMap= new userObjectMap();
        userObjMap.addObjectMap(jsonArr);
        launch(args);
    }
}
