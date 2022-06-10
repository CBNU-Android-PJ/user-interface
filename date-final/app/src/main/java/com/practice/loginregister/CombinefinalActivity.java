package com.practice.loginregister;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CombinefinalActivity extends AppCompatActivity {

    private ListView FinalList;
    private ArrayList<String> combineData;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_combine_final);

        //선택된 재료 데이터 가져오기
        combineData = new ArrayList<>();
        Intent intent = getIntent();


        //DB에 있는 추천된 레시피 가져와서 listview에 배열로 넣기
        //리스트 속 item 연결
        FinalList = (ListView) findViewById(R.id.final_listview);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        FinalList.setAdapter(adapter); //adapter를 list에 set. >> ListView와 Adapter 연결


        //임의로 data 넣기
        for (int i = 0; i < 100; i++) {
            data.add("sfddg");
        }



    }
}
