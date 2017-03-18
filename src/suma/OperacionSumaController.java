/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jean pierre
 */
public class OperacionSumaController implements Initializable {
    
    private Ordenador ord;

    @FXML
    private TextField tfl_resultadoSuma, tfl_n3, tfl_n4;
    
    @FXML
    private Label label2;
    
    @FXML
    private void metodoSumar(ActionEvent event){
        String resultSuma = tfl_resultadoSuma.getText();
        Integer res2 = Integer.valueOf(resultSuma);
        String num3 = tfl_n3.getText();
        String num4 = tfl_n4.getText();
        Integer n3 = Integer.valueOf(num3);
        Integer n4 = Integer.valueOf(num4);
        
        int resSuma = n3 + n4;
        
        if(res2 == resSuma){
                label2.setText("Correcto");               
        }
        else{
                label2.setText("Incorrecto!");
                tfl_resultadoSuma.setText("");
                
            }
        
    }
    
    @FXML
    private void metodoReini(ActionEvent event) {
        Random num2 = new Random();
        int n3 = num2.nextInt(50)+1;
        int n4 = num2.nextInt(50)+1;
        String num3 = String.valueOf(n3);
        String num4 = String.valueOf(n4);
        tfl_n3.setText(num3);
        tfl_n4.setText(num4);
        tfl_resultadoSuma.setText("");
        label2.setText("");
    }  
    
    @FXML
    private void metodoVolver(ActionEvent event){
        
        
        
        ord.pantallaPrincipal();
        
        
        
    }
   
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Random num2 = new Random();
        int n3 = num2.nextInt(50)+1;
        int n4 = num2.nextInt(50)+1;
        String num3 = String.valueOf(n3);
        String num4 = String.valueOf(n4);
        tfl_n3.setText(num3);
        tfl_n4.setText(num4);
    } 

    
        
    void setMainApp(Ordenador main) {
        this.ord = main;
    }

    
    
}
