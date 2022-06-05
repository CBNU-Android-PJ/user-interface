package com.cookandroid.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private ViewPager2Adapter ViewPager2Adapter;

//광고 배너 자동 무한 슬라이드
    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 2000;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 2000; // time in milliseconds between successive task executions.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Fragment 각각 10개의 배너
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(Fragment1.newInstance(0));
        fragments.add(Fragment2.newInstance(1));
        fragments.add(Fragment3.newInstance(2));
        fragments.add(Fragment4.newInstance(3));
        fragments.add(Fragment5.newInstance(4));
        fragments.add(Fragment6.newInstance(5));
        fragments.add(Fragment7.newInstance(6));
        fragments.add(Fragment8.newInstance(7));
        fragments.add(Fragment9.newInstance(8));
        fragments.add(Fragment10.newInstance(9));

        viewPager2 = (ViewPager2) findViewById(R.id.viewPager_banner);
//viewpager2 연결해주는 adapter
        ViewPager2Adapter viewPager2Adapter = new ViewPager2Adapter(this, fragments);
        viewPager2.setAdapter(viewPager2Adapter);
//배너 자동 슬라이드 기능 구현
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            @Override
            public void run() {
                if (currentPage == 9) {
                    currentPage = 0;
                }
                viewPager2.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);



//@Override
        //protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);


        //알람 버튼 클릭시 액티비티 전환
        //Layout Resource File로 alram_activity.xml과 연결할 Alram.java클래스 생성 필요
        // Button alram_btn = (Button) findViewById(R.id.alram_btn);
        // alram.setOnClickListener(new View.OnClickListener(){

        // @Override
        // public void onClick(View view){
        // Intent intent = new Intent(getApplicationContext(), Alram.class);
        // startActivity(intent);
        // }
        // });
        //
        // 유저 버튼 클릭시 액티비티 전환
        //Layout Resource File로 user_activity.xml과 연결할 User.java클래스 생성 필요
        // Button user_btn = (Button) findViewById(R.id.user_btn);
        // user_btn.setOnClickListener(new View.OnClickListener(){
        //
        // @Override
        // public void onClick(View view){
        // Intent intent = new Intent(getApplicationContext(), User.class);
        // startActivity(intent);
        // }
        // });
        //}
    }
}