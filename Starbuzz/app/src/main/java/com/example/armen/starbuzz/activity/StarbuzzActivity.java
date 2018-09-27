package com.example.armen.starbuzz.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.armen.starbuzz.R;

public class StarbuzzActivity extends AppCompatActivity {

    private AdapterView.OnItemClickListener itemClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starbuzz);

        onItemClickLisiner();
        buildListView();

    }

    private void onItemClickLisiner() {
                itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id) {
                        getDrinkPositoin(position);
                        getFoodPosition(position);
                        getCakesPosition(position);
                    }
                };
    }

    private void getDrinkPositoin(final int position) {
        if (position == 0) {
            final Intent intent = new Intent(StarbuzzActivity.this, DrinksCategoryActivty.class);
            startActivity(intent);
        }
    }

    private void getFoodPosition(final int position){
        if (position == 1){
            final Intent intent = new Intent(StarbuzzActivity.this, FoodCategoryActivity.class);
            startActivity(intent);

        }
    }

    private void getCakesPosition(final int position){
        if (position == 2){
            final Intent intent = new Intent(StarbuzzActivity.this, CakesCategoryActivity.class);
            startActivity(intent);
        }
    }

    private void buildListView() {
        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
