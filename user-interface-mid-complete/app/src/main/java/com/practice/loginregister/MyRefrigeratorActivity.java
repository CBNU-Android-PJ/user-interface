package com.practice.loginregister;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MyRefrigeratorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acvtivity_my_refrigerator);
        ListView listview ;
        MyRefrigeratorAdapter adapter;

        adapter = new MyRefrigeratorAdapter() ;

        listview = (ListView) findViewById(R.id.listview1);
        listview.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listview.setAdapter(adapter);
        // 예시로 리스트뷰에 추가
        adapter.addItem("소고기", "d-7") ;

        //추가버튼 누를시 재료추가 페이지로 이동
        Button add = (Button) findViewById(R.id.add_btn);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //버튼 클릭시 재료 추가 페이지 이동 구현
                Intent intent = new Intent(getApplicationContext(), IngredientSelectActivity.class);
                startActivity(intent);
            }
        });
// delete button에 대한 이벤트 처리.
        Button deleteButton = (Button)findViewById(R.id.delete_btn) ;

    }

}