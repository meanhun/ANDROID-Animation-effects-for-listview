package com.share4happy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> ds_thongtin;
    Adapter_Thongtin adapter_thongtin;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        listView = findViewById(R.id.lv_dsthongtin);
        ds_thongtin = new ArrayList<>();
        for (int i=1;i<200;i++){
            ds_thongtin.add("Hwang Mean Hun: "+i);
        }
        adapter_thongtin = new Adapter_Thongtin(MainActivity.this,R.layout.item,ds_thongtin);
        listView.setAdapter(adapter_thongtin);
        adapter_thongtin.notifyDataSetChanged();
    }
}