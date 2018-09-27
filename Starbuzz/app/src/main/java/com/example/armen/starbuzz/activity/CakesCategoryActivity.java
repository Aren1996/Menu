package com.example.armen.starbuzz.activity;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.armen.starbuzz.R;
import com.example.armen.starbuzz.model.Cakes;

public class CakesCategoryActivity extends ListActivity {

    private ArrayAdapter<Cakes> arrayChakes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildArrayAdapter();
        bulidListView();
    }

    private void buildArrayAdapter() {
        arrayChakes = new ArrayAdapter<>(
                this, R.layout.support_simple_spinner_dropdown_item, Cakes.cakes);
    }

    @SuppressLint("ResourceAsColor")
    private void bulidListView(){
        final ListView listView = getListView();
        listView.setAdapter(arrayChakes);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        openCakesActivity(id);
    }

    private void openCakesActivity(long id){
        final Intent intent = new Intent(CakesCategoryActivity.this, CakesActivity.class);
        intent.putExtra(CakesActivity.EXSTRA_CAKES, (int) id);
        startActivity(intent);
    }
}
