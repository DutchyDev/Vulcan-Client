package dev.dutchy.vulcan.client;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Dashboard extends StackPane {

    public Dashboard() {
        Text text = new Text("Dashboard");
        text.setFont(Font.font(100.0));
        this.getChildren().add(text);
    }

}
