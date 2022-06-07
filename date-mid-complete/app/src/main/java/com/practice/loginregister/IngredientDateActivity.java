package com.practice.loginregister;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class IngredientDateActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        IngredientDateAdapter adapter;
        ListView dateListView;

        adapter = new IngredientDateAdapter();

        dateListView = (ListView) findViewById(R.id.date_listview);
        dateListView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        dateListView.setAdapter(adapter);

        adapter.addDateItem("소고기", "22-06-13");
        //완료버튼 누를시 나의 냉장고 페이지로 이동
        Button Complete = (Button) findViewById(R.id.date_complete);

        Complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //버튼 클릭시 나의 냉장고 페이지 이동 구현
                Intent intent = new Intent(getApplicationContext(), MyRefrigeratorActivity.class);
                startActivity(intent);
            }

        });


        Button dateSet = (Button) findViewById(R.id.date_select);
        TextView Date = findViewById(R.id.date_message);

        dateSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IngredientDateActivity.this, DatePickerActivity.class);

                startActivityForResult(new Intent(IngredientDateActivity.this, DatePickerActivity.class), 0);

            }
        });
    }
}


