package todobase.application;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ItemMenuController implements Initializable {
    //initialize all fxml objects

    //initialize method
    public void initialize(URL location, ResourceBundle resources){
        //get the current list from ListManager

        //load all items from currentList into tableview
    }

    //when show only incomplete items is selected from dropdown
        //unhide any hidden items in the observable list

        //hide all complete items from the observable list

    //when show only complete items is selected from dropdown
        //unhide any hidden items in the observable list

        //hide all incomplete items from the observable list

    //when show all items is selected from dropdown
        //unhide any hidden items in the observable list

    //when create new item button is clicked
        //launch NewItem scene from popUp in AppManager

    //when back to list selection button is clicked
        //load ListMenu scene to mainStage in AppManager

    //when remove item button is clicked
        //get currently selected item using setCurrentItem in List class

        //remove the currentItem from the currentList

    //when edit button is clicked
        //get currently selected item using setCurrentItem in List class

        //launch ItemEdit scene in popUp from AppManager
}
