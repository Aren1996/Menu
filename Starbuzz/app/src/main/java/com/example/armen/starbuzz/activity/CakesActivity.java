package com.example.armen.starbuzz.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.armen.starbuzz.R;
import com.example.armen.starbuzz.model.Cakes;

public class CakesActivity extends AppCompatActivity {

    public static final String EXSTRA_CAKES = "exstra cakes";
    private TextView name;
    private TextView description;
    private ImageView photo;
    private Cakes cakes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakes);

        findViewById();
        getItemId();
        buildAppearance();
    }

    private void findViewById() {
        photo = findViewById(R.id.photo_cakes);
        name = findViewById(R.id.name_cakes);
        description = findViewById(R.id.description_cakes);
    }

    private void getItemId() {
        int cakesId = (Integer) getIntent().getExtras().get(EXSTRA_CAKES);
        cakes = Cakes.cakes[cakesId];
    }

    private void buildAppearance(){
        name.setText(cakes.getName());
        description.setText(cakes.getDescription());
        photo.setImageResource(cakes.getPhoto());
    }
}
