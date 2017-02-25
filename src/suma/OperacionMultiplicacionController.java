package suma;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;

public class OperacionMultiplicacionController implements Initializable {
    
    @FXML
    private Label label1;
    @FXML
    private TextField tfl_n1,tfl_n2,tfl_resultado;
    
    @FXML
    private void metodoMultiplicar(ActionEvent event) {
        String result = tfl_resultado.getText();
        Integer res = Integer.valueOf(result);
        String num1 = tfl_n1.getText();
        String num2 = tfl_n2.getText();
        Integer n1 = Integer.valueOf(num1);
        Integer n2 = Integer.valueOf(num2);
        
        int resultadoCorrecto = n1 * n2;          
        
            if(res == resultadoCorrecto){
                label1.setText("Correcto");
               
            }
            else{
                label1.setText("Incorrecto!");
                tfl_resultado.setText("");
                
            }
        
    }
    @FXML
    private void metodoNuevo(ActionEvent event) {
        Random num = new Random();
        int n1 = num.nextInt(9)+1;
        int n2 = num.nextInt(9)+1;
        String num1 = String.valueOf(n1);
        String num2 = String.valueOf(n2);
        tfl_n1.setText(num1);
        tfl_n2.setText(num2);
        tfl_resultado.setText("");
        label1.setText("");
    }    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Random num = new Random();
        int n1 = num.nextInt(9)+1;
        int n2 = num.nextInt(9)+1;
        String num1 = String.valueOf(n1);
        String num2 = String.valueOf(n2);
        tfl_n1.setText(num1);
        tfl_n2.setText(num2);
    }    
    
}
