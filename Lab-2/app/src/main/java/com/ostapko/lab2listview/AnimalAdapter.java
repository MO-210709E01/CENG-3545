package com.ostapko.lab2listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {

    private List<Animal> animals;
    private LayoutInflater inflator;

    public AnimalAdapter(List<Animal> animals, Activity activity) {
        this.animals = animals;
        inflator = activity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int i) {
        return animals.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView;

        rowView = inflator.inflate(R.layout.listview_row, null);
        TextView textView = rowView.findViewById(R.id.label);
        textView.setText(animals.get(i).getType());

        ImageView imageView = rowView.findViewById(R.id.imageView);
        imageView.setImageResource(animals.get(i).getPicId());

        return null;
    }
}
