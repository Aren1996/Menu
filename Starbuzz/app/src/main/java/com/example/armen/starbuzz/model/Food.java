package com.example.armen.starbuzz.model;

import com.example.armen.starbuzz.R;

public class Food {

    private final String name;
    private final String description;
    private final int image;

    private Food(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public static Food[] foods = {
            new Food("Pizza", "Pizza is a savoury dish of Italian origin, consisting of a usually round", R.drawable.pizza),
            new Food("Hot Dog", "Hot dog se smatra jednom od omiljenih proizvoda brze hrane", R.drawable.hotdog),
            new Food("Burger", "Hamburger, also called burger, ground beef", R.drawable.burger)};

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
