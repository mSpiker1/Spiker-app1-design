/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Matthew Spiker
 */

package todobase.application;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class ListMenuController implements Initializable {
    //initialize all fxml objects

    //initialize method to run when the scene is launched
    public void initialize(URL location, ResourceBundle resources){
        //open directory with a File object to the directory containing the lists

        //call load function from LoadLists class to load all saved lists to ListManager's listOfLists

        //load all saved lists to the tableview, along with numbers to the list number column
    }

    //when select button is clicked
        //grab the currently selected list from the tableview

        //match it with an existing list using listMatch method in ListManager, also setting the currentList object

        //change the main scene to ItemMenu

    //when create new list button is clicked
        //open ListCreate scene from popUp in AppManager class

    //when edit list name button is clicked
        //get the currently selected list from the tableview

        //use method in ListManager to match the selected List to an existing list in listOfLists

        //set that list to currentList

        //open ListEdit scene from popUp in AppManager class

    //when save button is clicked
        //open saveLists scene from popUp in AppManager class
}