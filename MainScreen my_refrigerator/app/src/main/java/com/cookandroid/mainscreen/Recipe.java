package com.cookandroid.mainscreen;
//레시피 동작
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recipe extends AppCompatActivity {
    private ListView list;

    //변수 link에 웹뷰 url 데이터 저장하는 코드!!!!!!!!!!!-여기 link에 구현해주면 되옹!!
    final String link = "https://www.naver.com/";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);


        //DB에 있는 레시피 string으로 가져와서 listview에 배열로 넣기
        //리스트 속 item 연결
        list = (ListView) findViewById(R.id.list1);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter); //adapter를 list에 set. >> ListView와 Adapter 연결




        //리스트의 아이템 클릭시 웹뷰로 이동
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //기능 구현
                //한줄 클릭하면 작동하는데, 웹뷰로 url넘겨서 할거임.
                //형은 url에 저장만 하면 됨.
                //변수 link에 저장된 url을  string으로 입력받아서 웹뷰로 이동
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
            }
        });


        //임의로 data 넣기
        for (int i = 0; i < 100; i++) {
            data.add("sfddg");
        }



        //검색 버튼 클릭 이벤트
        ImageButton search_btn = (ImageButton) findViewById(R.id.imageButton);


        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //기능 구현할 부분
            }
        });

    }
}

