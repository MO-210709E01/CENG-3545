package com.ostapko.lab2listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Hamster", R.mipmap.ic_hamster));
        animals.add(new Animal("Penguin", R.mipmap.ic_penguin));

        final ListView listView = (ListView) findViewById(R.id.listview);

        AnimalAdapter animalAdapter = new AnimalAdapter(animals, this);

        listView.setAdapter(animalAdapter);
    }
}