package dev.dutchy.vulcan.client;

import com.jfoenix.controls.JFXDrawer;
import dev.dutchy.vulcan.client.module.OnlinePlayersModule;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Container extends AnchorPane {

    private final JFXDrawer drawer = new JFXDrawer();

    public Container() {

        Header nav = new Header();

        AnchorPane.setTopAnchor(nav, 0.0);
        AnchorPane.setLeftAnchor(nav, 0.0);
        AnchorPane.setRightAnchor(nav, 0.0);

        VBox sidebar = new VBox();
        sidebar.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        
        this.drawer.setSidePane(sidebar);
        this.drawer.setDefaultDrawerSize(150);
        this.drawer.setAlignment(Pos.TOP_CENTER);
        this.drawer.open();
        this.drawer.setOverLayVisible(true);
        this.drawer.setDirection(JFXDrawer.DrawerDirection.LEFT);
        this.drawer.setMiniDrawerSize(50.0);

        AnchorPane.setTopAnchor(drawer, nav.getPrefHeight());
        AnchorPane.setLeftAnchor(drawer, 0.0);
        AnchorPane.setRightAnchor(drawer, 0.0);
        AnchorPane.setBottomAnchor(drawer, 0.0);

        this.addRouterButton("Dashboard", new Dashboard());

        OnlinePlayersModule module = new OnlinePlayersModule();

        this.getChildren().addAll(drawer, nav, module);
    }

    public void addRouterButton(String text, Pane content) {
        RouterButton button = new RouterButton(text, 150, 40, content, this);

        for (Node node : this.drawer.getSidePane()) {
            if (node instanceof VBox) {
                VBox sidebar = (VBox) node;

                sidebar.getChildren().add(button);
            }
        }
    }

    public void setContent(Pane content) {
        this.drawer.setContent(content);
    }
}
