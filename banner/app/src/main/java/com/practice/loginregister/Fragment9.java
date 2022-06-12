package com.practice.loginregister;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment9 extends Fragment {
    Button banner9_btn;
    public static Fragment9 newInstance(int number) {
        Fragment9 fragment9 = new Fragment9();
        Bundle bundle = new Bundle();
        bundle.putInt("number", number);
        fragment9.setArguments(bundle);
        return fragment9;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            int num = getArguments().getInt("number");
        }
    }

    // 버튼 클릭 시 url주소로 이동
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment9, container, false);

        banner9_btn = view.findViewById(R.id.banner9_btn);

        banner9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nhhanaro.co.kr"));
                startActivity(intent1);

            }
        });
        return view;
    }
}