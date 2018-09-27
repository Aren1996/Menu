package com.example.armen.starbuzz.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.armen.starbuzz.R;
import com.example.armen.starbuzz.model.Drink;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXSTRA_DRINK = "exstra drink";
    private TextView description;
    private TextView name;
    private ImageView photo;
    private Drink drink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        findViewById();
        getItemId();
        buildAppearance();
    }

    private void findViewById(){
        photo = findViewById(R.id.photo_drink);
        name = findViewById(R.id.name_drik);
        description = findViewById(R.id.description_drink);
    }

    private void getItemId(){
        int drinkNo = (Integer)getIntent().getExtras().get(EXSTRA_DRINK);
        drink = Drink.drinks[drinkNo];
    }

    private void buildAppearance(){
        photo.setImageResource(drink.getImageResourceId());
        name.setText(drink.getName());
        description.setText(drink.getDescription());
    }
}
