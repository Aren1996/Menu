package com.example.armen.starbuzz.model;

import com.example.armen.starbuzz.R;

public class Cakes {

    private final String name;
    private final String description;
    private final int photo;

    public Cakes(String name, String description, int photo) {
        this.name = name;
        this.description = description;
        this.photo = photo;
    }

    public static Cakes[] cakes = {
            new Cakes("Mikado ","Mikado Fans sind die Kreativsten: Wir haben einige coole Kuchen Ideen", R.drawable.mikado),
            new Cakes("Pancho", "The cake has moist layers of chocolate and vanilla cake, soaked in vanilla cream", R.drawable.pancho),
            new Cakes("Snickers", "For all the Snickers lovers out there, this cake will soon become your fave", R.drawable.snickers)};

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPhoto() {
        return photo;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
