package com.susnilo.spring;

public class Monster {
    private String name;
    private String imageSource;
    private String description;

    public Monster(String name, String imageSource, String description) {
        this.name = name;
        this.imageSource = imageSource;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getImageSource() {
        return imageSource;
    }

    public String getDescription() {
        return description;
    }
}
