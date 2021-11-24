package todobase.application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class AppManager {
    //initialize an empty stage object "mainStage"
    private static Stage mainStage = new Stage();

    //initialize an empty stage object "popUp"

    //setter for mainStage
    public static void setMainStage(Stage stage){
        mainStage = stage;
    }

    //getter for mainStage

    //method to load separate fxml scenes as popups
    public static void popUp(int sceneNum, String title){
        //create an arraylist to fill with fxml scenes of popup scenes (create item menu, create list menu, etc.)

        //load all fxml files through fxmlloaders

        //create scenes from all fxmlloaders

        //set scene of popUp stage using sceneNum and arrayList

        //set title of popUp stage using title

        //set popUp stage to be non-resizeable

        //show popUp stage
    }

    //method to close the popUp stage

    //method to load the main stage
    public static void loadMainStage(int sceneNum, String title) throws IOException {
        //create an arraylist to hold the potential main stage's scenes
        ArrayList<Scene> mainSceneList = new ArrayList<>();

        //load the main fxml files (ListMenu, ItemMenu, etc.), (just ListMenu for psuedocode to launch the program)
        FXMLLoader mainFxml = new FXMLLoader(ToDoApp.class.getResource("ListMenu.fxml"));

        //load fxmlloaders to scenes
        Scene mainScene = new Scene(mainFxml.load(), 800, 600);

        //fill mainSceneList with scenes of these fxml loaders
        mainSceneList.add(mainScene);

        //set mainStage based on sceneNum of mainSceneList
        mainStage.setScene(mainSceneList.get(sceneNum));
        mainStage.setTitle(title);
        mainStage.show();
    }
}
