package duocuc.rutasur;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("main-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("RutaSur — Registro de Peajes");
        stage.setScene(scene);
        stage.show();
    }
}
