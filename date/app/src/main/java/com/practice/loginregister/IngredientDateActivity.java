package com.practice.loginregister;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class IngredientDateActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);


        //TextView vDate = findViewById(R.id.date_message);

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
       // vDate.setOnClickListener(new View.OnClickListener(){
         //   @Override
         //   public void onClick(View view) {
         //       Intent intent = new Intent(getApplicationContext(), DatePickerActivity.class);
         //       startActivity(intent);
         //   }
      //  });
    }

}

