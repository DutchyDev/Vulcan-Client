package dev.dutchy.vulcan.client;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.Text;

public class Header extends VBox {

    public Header() {
        this.setPrefHeight(80.0);
        this.setMinHeight(80.0);
        this.setMaxHeight(80.0);

        this.setAlignment(Pos.CENTER_LEFT);
        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#00ccff"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setEffect(new DropShadow());

        Text text = new Text(VulcanClient.TITLE);
        text.setFill(Color.valueOf("#ff6714"));
        text.setFont(Font.loadFont(VulcanClient.class.getResourceAsStream("/font/PottaOne.ttf"), 40));
        text.setFontSmoothingType(FontSmoothingType.GRAY);
        text.setEffect(new DropShadow(2, 2, 2, Color.BLACK));

        text.setOnMouseEntered(event -> {
            this.getScene().setCursor(Cursor.HAND);
            text.setFill(Color.valueOf("#ff6714").darker());
        });

        text.setOnMouseExited(event -> {
            this.getScene().setCursor(Cursor.DEFAULT);
            text.setFill(Color.valueOf("#ff6714"));
        });

        VBox.setMargin(text, new Insets(0, 0, 0, 10));

        this.getChildren().add(text);
    }

}
