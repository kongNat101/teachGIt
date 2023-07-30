package cs211.project.controllers;

import cs211.project.services.FXRouter;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MemberFormController {
    @FXML
    TextField memberName;
    @FXML
    TextField memberNickname;
    @FXML
    TextField memberAge;
    @FXML
    TextField memberGender;
    @FXML
    TextField memberEmail;
    @FXML
    TextField memberTelephoneNumber;
    @FXML
    protected void onDoneButton(){
        try{
            FXRouter.goTo("staff-form");
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    @FXML
    protected void onClickPreviousButton(){
    try{
        FXRouter.goTo("hello");
    }
    catch(IOException e){
        throw new RuntimeException(e);
        }
    }
}
