
package suma;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class PantallaPrincipalController implements Initializable {

    
    private Ordenador main;
    
    @FXML
    private void operacionSuma(ActionEvent event) throws IOException{
        try{
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/suma/OperacionSuma.fxml"));
        AnchorPane internalWindow = (AnchorPane) loader.load();
         OperacionSumaController controller = loader.getController();
        controller.setMainApp(main);
        Scene scene = new Scene(internalWindow);
        main.primaryStage.setScene(scene);
        main.primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(OperacionSumaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void operacionMultiplicar(ActionEvent event) throws IOException{
        try{
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/suma/OperacionMultiplicacion.fxml"));
        AnchorPane internalWindow = (AnchorPane) loader.load();
        
        Scene scene = new Scene(internalWindow);
        main.primaryStage.setScene(scene);
        main.primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(OperacionSumaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    void setMainApp(Ordenador main) {
        this.main = main;
    }

    
}
