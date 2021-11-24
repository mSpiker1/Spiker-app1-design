package todobase.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        //send the primary stage to AppManager to handle the stages and scenes
        AppManager.setMainStage(primaryStage);

        //load the main stage up with the correct scene
        AppManager.loadMainStage(0, "To Do List Application");
    }

    public static void main(String[] args) {
        launch();
    }
}

class LoadLists{
    //load method to load all lists from a given directory to ListManager's listOfLists
}

class SaveLists{
    //save method to save all selected lists from ListManager's listOfLists to a given directory
}