package com.cookandroid.mainscreen;
//사용자 버튼 동작
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.net.ResponseCache;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class User_Btn extends Activity {

    private Button backBtn;

    private ImageView userRef;
    private EditText userName;
    String name = "naengsiljang";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_btn);

        userName = findViewById(R.id.user_name);


        //뒤로가기 버튼
        backBtn = findViewById(R.id.back_btn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Back();
            }
        });
        //나의냉장고 이동 버튼
        userRef = findViewById(R.id.user_ref);

        userRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ref_go();

            }
        });
    }



    //뒤로가기 동작
    public void Back() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void Ref_go() {
        Intent intent = new Intent(this, Refrigerator.class);
        startActivity(intent);
    }

}

