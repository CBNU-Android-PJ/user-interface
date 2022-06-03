package com.cookandroid.mainscreen;
//사용자 버튼 동작
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class Refrigerator extends Activity {

    private Button addBtn;
    private Button deleteBtn;

    private ListView list2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_refrigerator);

        //재료추가 버튼 이동
        addBtn = findViewById(R.id.add_btn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Add();
            }
        });
        deleteBtn = findViewById(R.id.delete_btn);

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Delete();
            }
        });
        //DB에 있는 레시피 string으로 가져와서 listview에 배열로 넣기
        //리스트 속 item 연결
        list2 = (ListView) findViewById(R.id.list1);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        list2.setAdapter(adapter); //adapter를 list에 set. >> ListView와 Adapter 연결

    }



    //재료추가 버튼 이동
    public void Add() {
        //Intent intent = new Intent(this, 재료추가.class);
       // startActivity(intent);
    }
    //재료삭제 버튼 이동
    public void Delete() {
        //Intent intent = new Intent(this, 재료추가.class);
        // startActivity(intent);
    }
}




