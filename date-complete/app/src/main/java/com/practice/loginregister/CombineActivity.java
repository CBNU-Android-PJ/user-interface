package com.practice.loginregister;

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


public class CombineActivity extends Activity {

    private Button comBtn;

    private ListView list2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combine);



        //DB에 있는 추가한 재료 string으로 가져와서 listview에 배열로 넣기
        //리스트 속 item 연결
        list2 = (ListView) findViewById(R.id.ref_listview);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, data);
        list2.setAdapter(adapter); //adapter를 list에 set. >> ListView와 Adapter 연결
        //임의로 data 넣기
        for (int i = 0; i < 3; i++) {
            data.add("sf");
        }

        Button combine = (Button) findViewById(R.id.combine);

        combine.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count, checked ;
                count = adapter.getCount() ;

                if (count > 0) {
                    // 현재 선택된 아이템의 position 획득.
                    checked = list2.getCheckedItemPosition();

                    //여기에 조합하는 기능 구현 필요!!
                    //밑에 함수는 삭제 기능 예시야 그래서 그냥 무시해 혹시 변수 이름 필요할까봐 넣어놨어!
                    if (checked > -1 && checked < count) {
                        // 아이템 삭제
                        data.remove(checked) ;

                        // listview 선택 초기화.
                        list2.clearChoices();

                        // listview 갱신.
                        adapter.notifyDataSetChanged();
                    }
                }

            }
        });
    }





    //재료추가 버튼 이동
    public void Add() {
        Intent intent = new Intent(this, IngredientSelectActivity.class);
        startActivity(intent);
    }

}