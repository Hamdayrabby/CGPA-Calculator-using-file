/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CgpaCalculator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AddResultController implements Initializable {

    @FXML
    private TextField Name;
    @FXML
    private TextField ID;
    @FXML
    private TextField Session;
    @FXML
    private TextField Semester;
    @FXML
    private TextField Subject;
    @FXML
    private TextField Creadit;
    @FXML
    private TextField Grade;
  String name1,id1,session1,semester1,subject1,creadit1,grade1,not="";
   
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void resultAction(ActionEvent event) throws IOException
    {
        subject1=Subject.getText();
        name1=Name.getText();
        id1=ID.getText();
        session1=Session.getText();
        creadit1=Creadit.getText();
        grade1=Grade.getText();
        semester1=Semester.getText();
         File file=new File("Data.txt");
         if(!file.exists())
         {
             file.createNewFile();
             
         }
        FileWriter filewriter=new FileWriter(file,true);
        filewriter.write(id1+" "+session1+" "+semester1+" "+subject1+" "+creadit1+" "+grade1+" "+name1+"\n");
        filewriter.close();
         
        Stage stage = new Stage();
         Parent pane=FXMLLoader.load(getClass().getResource("Notfication.fxml"));
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        stage.show();
        
        
    }
    
}
