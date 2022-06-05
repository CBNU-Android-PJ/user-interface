package com.practice.loginregister;
//레시피 동작
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AllRecipeActivity extends AppCompatActivity {
    private ArrayList<String> list;          // 데이터를 넣은 리스트변수
    private ListView listView;          // 검색을 보여줄 리스트변수
    private EditText editSearch;        // 검색어를 입력할 Input 창
    private SearchAdapter adapter;      // 리스트뷰에 연결할 아답터
    private ArrayList<String> arraylist;
    final String link = "https://www.naver.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("re1");
        setContentView(R.layout.activity_main);
        System.out.println("re2");

        editSearch = (EditText) findViewById(R.id.editSearch);
        listView = (ListView) findViewById(R.id.list1);
        System.out.println("re3");
        // 리스트를 생성한다.
        list = new ArrayList<String>();
        System.out.println("re4");
        // 검색에 사용할 데이터을 미리 저장한다.
        settingList();
        System.out.println("re5");
        // 리스트의 모든 데이터를 arraylist에 복사한다.// list 복사본을 만든다.
        arraylist = new ArrayList<String>();
        arraylist.addAll(list);
        System.out.println("re6");
        // 리스트에 연동될 아답터를 생성한다.
        adapter = new SearchAdapter(list, this);

        // 리스트뷰에 아답터를 연결한다.
        listView.setAdapter(adapter);

        // input창에 검색어를 입력시 "addTextChangedListener" 이벤트 리스너를 정의한다.
        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                // input창에 문자를 입력할때마다 호출된다.
                // search 메소드를 호출한다.
                String text = editSearch.getText().toString();
                search(text);
            }
        });
        //리스트의 아이템 클릭시 웹뷰로 이동
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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


    }

    // 검색을 수행하는 메소드
    public void search(String charText) {

        // 문자 입력시마다 리스트를 지우고 새로 뿌려준다.
        list.clear();

        // 문자 입력이 없을때는 모든 데이터를 보여준다.
        if (charText.length() == 0) {
            list.addAll(arraylist);
        }
        // 문자 입력을 할때..
        else
        {
            // 리스트의 모든 데이터를 검색한다.
            for(int i = 0;i < arraylist.size(); i++)
            {
                // arraylist의 모든 데이터에 입력받은 단어(charText)가 포함되어 있으면 true를 반환한다.
                if (arraylist.get(i).toLowerCase().contains(charText))
                {
                    // 검색된 데이터를 리스트에 추가한다.
                    list.add(arraylist.get(i));
                }
            }
        }
        // 리스트 데이터가 변경되었으므로 아답터를 갱신하여 검색된 데이터를 화면에 보여준다.
        adapter.notifyDataSetChanged();
    }



    private void settingList()
    {

        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        list = databaseAccess.viewmenu();

    }




}
