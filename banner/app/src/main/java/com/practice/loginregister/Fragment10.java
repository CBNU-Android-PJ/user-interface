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

public class Fragment10 extends Fragment {
    Button banner10_btn;
    public static Fragment10 newInstance(int number) {
        Fragment10 fragment10 = new Fragment10();
        Bundle bundle = new Bundle();
        bundle.putInt("number", number);
        fragment10.setArguments(bundle);
        return fragment10;
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
        View view = inflater.inflate(R.layout.fragment10, container, false);

        banner10_btn = view.findViewById(R.id.banner10_btn);

        banner10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cjthemarket.com"));
                startActivity(intent1);

            }
        });
        return view;
    }
}