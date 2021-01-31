package dev.dutchy.vulcan.client.module;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import dev.dutchy.vulcan.client.model.VulcanPlayer;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class OnlinePlayersModule extends VBox {

    public OnlinePlayersModule() {
        try {
            HttpResponse<String> response = Unirest.get("http://localhost:8080/players/online").asString();

            Gson gson = new Gson();

            Type type = new TypeToken<ArrayList<VulcanPlayer>>() {}.getType();

            List<VulcanPlayer> list = gson.fromJson(response.getBody(), type);

            list.forEach(System.out::println);

            InputStream is = Unirest.get("https://crafatar.com/avatars/1e36cb37-7f0b-4ea1-8c24-d304471259da").asBinary().getBody();

            Image image = new Image(is);

            ImageView view = new ImageView(image);

            this.getChildren().add(view);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
