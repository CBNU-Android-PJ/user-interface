package com.cookandroid.mainscreen;
//레시피 동작
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Recipe extends AppCompatActivity {
    private ListView list;

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

        //리스트의 아이템 클릭시 작동
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //기능 구현

                //아래는 예시
                //Intent intent = new Intent(getApplicationContext(), ListClicked.class);

                /* putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값 */
                //intent.putExtra("profile", Integer.toString(data.get(position).getProfile()));
                //intent.putExtra("info", data.get(position).getInfo());
                //intent.putExtra("phone", data.get(position).getPhone());
                //startActivity(intent);
            }
        });


        //임의로 data 넣기
        for (int i = 0; i < 100; i++) {
            data.add("sfddg");
        }
        adapter.notifyDataSetChanged();





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