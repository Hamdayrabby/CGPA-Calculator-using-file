/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CgpaCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class StartClass extends Application
{
    public static void main(String[] args) 
    {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception 
    {
        //throw new UnsupportedOperationException("Not supported yet."); 
        Parent pane=FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
