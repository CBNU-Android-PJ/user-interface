package com.cookandroid.recipe_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=(ListView)findViewById(R.id.list1);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter); //adapter를 list에 set. >> ListView와 Adapter 연결

        //data 넣기
        for (int i=0; i<100; i++) {
            data.add("sfddg");
        }
                adapter.notifyDataSetChanged();
    }
}


