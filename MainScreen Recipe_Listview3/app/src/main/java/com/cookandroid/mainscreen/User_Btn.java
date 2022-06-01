package com.cookandroid.mainscreen;
//사용자 버튼 동작
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import java.net.ResponseCache;


public class User_Btn extends Activity {

    private Button backBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_btn);

        backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Back();
            }
        });
    }


    public void Back (){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }







}
