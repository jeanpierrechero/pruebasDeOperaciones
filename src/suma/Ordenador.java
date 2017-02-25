
package suma;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 *
 * @author jean pierre
 */
public class Ordenador extends Application {
    
    public Stage primaryStage;
    private AnchorPane rootLayout;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/suma/PantallaPrincipal.fxml"));
        rootLayout = (AnchorPane) loader.load();

        // Give the controller access to the main app.
        PantallaPrincipalController controller = loader.getController();
        controller.setMainApp(this);
        primaryStage = stage;
        Scene scene = new Scene(rootLayout);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
