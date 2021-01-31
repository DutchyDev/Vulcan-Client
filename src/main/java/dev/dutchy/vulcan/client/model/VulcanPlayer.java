package dev.dutchy.vulcan.client.model;

import java.util.UUID;

public class VulcanPlayer {

    private final String name;
    private final UUID id;

    public VulcanPlayer(String name, UUID id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "VulcanPlayer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
