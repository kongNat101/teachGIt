package cs211.project.controllers;

import cs211.project.models.Movie;
import cs211.project.services.FXRouter;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StaffFormController {
    @FXML
    TextField staffName;
    @FXML
    TextField staffNickname;
    @FXML
    TextField staffAge;
    @FXML
    TextField staffGender;
    @FXML
    TextField staffEmail;
    @FXML
    TextField staffTelephoneNumber;
    @FXML private ListView<Movie> staffTeamList;
    @FXML
    protected void onStaffClickPreviousButton(){
        try {
            FXRouter.goTo("member-form");
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    @FXML
    protected void onStaffClickDoneButton(){
        try {
            FXRouter.goTo("hello");
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
