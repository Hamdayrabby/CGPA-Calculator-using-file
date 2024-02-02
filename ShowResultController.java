/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CgpaCalculator;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.Pair;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ShowResultController implements Initializable {

    @FXML
    private TextField Names;
    @FXML
    private TextField Ids;
    @FXML
    private TextField Sess;
    @FXML
    private TextArea ouputRes;
    /**
     * Initializes the controller class.
     */String id2,sess2,scode,fname;
    int id1,sess1,sn,oid,osess;
    double credit1,grad1;
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    @FXML
    private void showAction(ActionEvent event) throws IOException 
    {
      ArrayList<ArrayList<Pair<String,String>>>arr=new ArrayList<>();
         id2=Ids.getText();
        oid=Integer.parseInt(id2);
        sess2=Sess.getText();
        osess=Integer.parseInt(sess2);
        String studentName=Names.getText();
         File file = new File("Data.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner input = new Scanner(file);
        for(int i=0;i<=20;i++)
        {
            arr.add(new ArrayList<>());
        }
        double[] creditarr=new double[20];
        double[] creditbrr=new double[20];
        for(int i=0;i<20;i++)
        {
            creditarr[i]=0.0;
            creditarr[i]=0.0;
        }
        int mxsemester=-1;
        while (input.hasNext())
        {
            id1=input.nextInt();
            sess1=input.nextInt();
            sn=input.nextInt();//semester no
            scode=input.next();
            credit1=input.nextDouble();
            grad1=input.nextDouble();
              fname=input.nextLine();
            if(id1==oid&&sess1==osess)
            {
                
              //  ArrayList<Pair<String,String>>brr=new ArrayList<>();
                //Pair<String,String>p1=new Pair<>(scode,""+grad1);
               // brr.add(p1);
                //System.out.println(credit1+" "+grad1);
               //arr.get(sn).add(p1);
               creditarr[sn]+=(credit1*grad1);
               creditbrr[sn]+=credit1;
               //percentarr[sn]=
               if(sn>=mxsemester)
               {
                   mxsemester=sn;
               }
                
            }
            
        }
       double totalPoint=0,totalCreadit=0;
      String ans="";
//      for(int i=0;i<3;i++)
//      {
//       System.out.println(creditarr[i]+" "+creditbrr[i]);
//      }
      
//        for(int i=0;i<arr.size();i++)
//        {
//           
//             ans+="In Semester "+(i+1)+": \n";
//             
//             for(int j=0;j<arr.get(i).size();j++)
//             {
//                 String s,s1;
//                 s=arr.get(i).get(j).getKey();
//                 s1=arr.get(i).get(j).getValue();
//                 ans+="Subject : "+s+" --->"+"Grade : "+s1+"\n";
//             }
//             ans+="\n";
//             ans+="Total GPA In Semester "+(i+1)+" : ";
//            totalCreadit+=creditbrr[i+1];
//            if(creditbrr[i+1]>0)
//            {
//                 double d1= creditarr[i+1]/creditbrr[i+1];
//               ans+=d1+"\n";
//            }
//            
//        }
//          if(totalCreadit>0)
//          {
//              ans+="\nTotal CGPA : "+( totalPoint/totalCreadit)+"\n";
//          }


//       
 ans+="\""+studentName+"\""+" You Have completed "+mxsemester+" Semester\n";
    ans+="All result Here : \n\n";
  for(int i=1;i<=mxsemester;i++)
  {
       totalPoint+= creditarr[i];
       totalCreadit+=creditbrr[i];
       
      //  System.out.println("IN Semester "+i+" "+creditarr[i]/creditbrr[i]);
      if(creditarr[i]<=0)
      {
          ans+="IN Semester "+i+" Failed"+" AND "; 
          ans+="Grade: 0\n";
      }
      else 
      {
          double d=creditarr[i]/creditbrr[i];
          String ss=String.format("%.3f", d);
          ans+="IN Semester "+i+" The GPA is : "+ss+" AND ";
          if(d==4.00)
              ans+="Grade: A+\n";
          else if(d<4.00&&d>=3.75)
              ans+="Grade: A\n";
          else if(d<3.75&&d>=3.5)
              ans+="Grade: A-\n";
          else if(d<3.5&&d>=3.25)
              ans+="Grade: B+\n";
          else if(d<3.25&&d>=3.0)
              ans+="Grade: B\n";
          else if(d<3.0&&d>=2.75)
              ans+="Grade: B-\n";
          else if(d<2.75&&d>=2.50)
              ans+="Grade: C+\n";
          else if(d<2.50&&d>=2.25)
              ans+="Grade: C\n";
          else if(d<2.25&&d>=2.0)
              ans+="Grade: D\n";
      }
      
  }
  
        //System.out.println("Total CGPA : "+totalPoint/totalCreadit);
        if(totalCreadit<=0||totalPoint<=0)
        {
             ans+="Failed\n";
        }
        else
        {
            double dd=totalPoint/totalCreadit;
            String ss=String.format("%.3f", dd);
            ans+="Total CGPA is : "+ss+"\n";
            if(dd==4.00)
              ans+="Grade: A+";
          else if(dd<4.00&&dd>=3.75)
              ans+="Grade: A";
          else if(dd<3.75&&dd>=3.5)
              ans+="Grade: A-";
          else if(dd<3.5&&dd>=3.25)
              ans+="Grade: B+";
          else if(dd<3.25&&dd>=3.0)
              ans+="Grade: B";
          else if(dd<3.0&&dd>=2.75)
              ans+="Grade: B-";
          else if(dd<2.75&&dd>=2.50)
              ans+="Grade: C+";
          else if(dd<2.50&&dd>=2.25)
              ans+="Grade: C";
          else if(dd<2.25&&dd>=2.0)
              ans+="Grade: D";
            ouputRes.setText(ans);
        }
        if(mxsemester==-1)
        {
            ans="ID Not Found\n";
            ouputRes.setText(ans);
        }
        
    }
    
}
