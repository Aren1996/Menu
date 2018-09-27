package com.example.armen.starbuzz.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.armen.starbuzz.R;
import com.example.armen.starbuzz.model.Food;

public class FoodCategoryActivity extends ListActivity {

    private ArrayAdapter<Food> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buildArrayAdapter();
        buildListView();

    }

    private void buildArrayAdapter() {
        listAdapter = new ArrayAdapter<>(
                this, R.layout.support_simple_spinner_dropdown_item, Food.foods);
    }

    private void buildListView() {
        final ListView listView = getListView();
        listView.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        openFoodActivity(id);
    }

    private void openFoodActivity(final long id) {
        final Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
        intent.putExtra(FoodActivity.EXSTRA_FOOD, (int) id);
        startActivity(intent);
    }
}
