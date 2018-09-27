package com.example.armen.starbuzz.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.armen.starbuzz.R;
import com.example.armen.starbuzz.model.Food;

public class FoodActivity extends AppCompatActivity {

    public static final String EXSTRA_FOOD = "exstra food";
    private TextView name;
    private TextView description;
    private ImageView photo;
    private Food food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        findViewById();
        getItemId();
        buidAddearance();
    }

    private void findViewById() {
        photo = findViewById(R.id.photo_food);
        name = findViewById(R.id.name_food);
        description = findViewById(R.id.description_food);
    }

    private void getItemId() {
        int foodId = (Integer) getIntent().getExtras().get(EXSTRA_FOOD);
        food = Food.foods[foodId];
    }

    private void buidAddearance() {
        name.setText(food.getName());
        description.setText(food.getDescription());
        photo.setImageResource(food.getImage());
    }
}
