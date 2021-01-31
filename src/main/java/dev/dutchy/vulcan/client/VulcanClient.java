package dev.dutchy.vulcan.client;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VulcanClient extends Application {

    public static String TITLE = "Vulcan";

    public void start(Stage stage) {
        stage.setTitle(TITLE);


        Scene scene = new Scene(new Container());

        stage.setScene(scene);

        stage.setWidth(1280);
        stage.setHeight(720);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
