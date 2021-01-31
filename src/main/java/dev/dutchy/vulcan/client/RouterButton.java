package dev.dutchy.vulcan.client;

import com.jfoenix.controls.JFXButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.Text;

public class RouterButton extends StackPane {

    private static final Font ROBOTO_MEDIUM = Font.loadFont(VulcanClient.class.getResourceAsStream("/font/Roboto-Medium.ttf"), 20);

    public RouterButton(String text, double width, double height, Pane content, Container container) {

        Text txt = new Text(text);
        txt.setFontSmoothingType(FontSmoothingType.GRAY);
        txt.setFont(ROBOTO_MEDIUM);

        JFXButton button = new JFXButton();
        button.setPrefWidth(width);
        button.setPrefHeight(height);

        this.setPrefWidth(width);
        this.setPrefHeight(height);

        button.setOnAction(event -> { container.setContent(content); });

        this.getChildren().addAll(txt, button);
    }

}
