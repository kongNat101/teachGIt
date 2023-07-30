package cs211.project.controllers;

import cs211.project.services.FXRouter;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

/**
 * This is a sample controller, generated by IntelliJ, not need in your project.
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void helloOnToNextPage(){
        try {
            FXRouter.goTo("member-form");
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}