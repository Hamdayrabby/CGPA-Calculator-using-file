/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CgpaCalculator;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MainFXMLController implements Initializable {

    @FXML
    private AnchorPane ChangeAbleScene;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void InputResultAc(ActionEvent event) throws IOException 
    {
        
        Parent pane = FXMLLoader.load(getClass().getResource("AddResult.fxml"));
        
         ChangeAbleScene.getChildren().setAll(pane);
    }

    @FXML
    private void showAction(ActionEvent event) throws IOException 
    {
         Parent pane = FXMLLoader.load(getClass().getResource("ShowResult.fxml"));
        
         ChangeAbleScene.getChildren().setAll(pane);
        
    }

    @FXML
    private void exitAction(ActionEvent event) 
    {
        
        System.exit(0);
    }
    
}
