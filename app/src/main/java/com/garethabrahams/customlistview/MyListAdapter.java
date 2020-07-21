package com.garethabrahams.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String [] progNames;
    private final Integer [] progImages;

    public MyListAdapter(Activity context, String [] progNames,Integer [] progImages) {
        super(context, R.layout.activity_image_list,progNames);
        this.context=context;
        this.progNames=progNames;
        this.progImages=progImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_image_list,null,true);
        TextView textView = (TextView) rowView.findViewById(R.id.textView_list);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView_list);
        textView.setText(progNames[position]);
        imageView.setImageResource(progImages[position]);
        return rowView;
    }
}
