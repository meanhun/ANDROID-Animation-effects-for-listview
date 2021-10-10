package com.share4happy;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter_Thongtin extends ArrayAdapter<String> {
    Activity context;
    int resource;
    @NonNull List<String> objects;
    public Adapter_Thongtin(@NonNull Activity context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View row = layoutInflater.inflate(this.resource,null);
        TextView txt = row.findViewById(R.id.textView);
        txt.setText(this.objects.get(position));
        //load hieu ung
        Animation animation = AnimationUtils.loadAnimation(this.context,R.anim.hieu_ung);
        row.startAnimation(animation);

        return row;
    }
}
