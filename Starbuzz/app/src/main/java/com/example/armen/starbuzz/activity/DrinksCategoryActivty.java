package com.example.armen.starbuzz.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.armen.starbuzz.model.Drink;

public class DrinksCategoryActivty extends ListActivity {

    private ArrayAdapter<Drink> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buildArrayAdapter();
        buildListView();
    }

    @Override
    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        openDrinkActivty(id);
    }

    private void openDrinkActivty(long id) {
        Intent intent = new Intent(DrinksCategoryActivty.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXSTRA_DRINK, (int) id);
        startActivity(intent);
    }


    private void buildArrayAdapter() {
        listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);
    }

    private void buildListView() {
        ListView listDrinks = getListView();
        listDrinks.setAdapter(listAdapter);
    }
}
