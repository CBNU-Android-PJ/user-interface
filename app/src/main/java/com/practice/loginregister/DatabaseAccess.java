package com.practice.loginregister;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseAccess {
    public SQLiteOpenHelper openHelper;
    public SQLiteDatabase db;
    public static DatabaseAccess instance;
    Cursor c = null;

    public DatabaseAccess(Context context) { //데이터 베이스 생성자
        this.openHelper = new DatabaseOpenHelper(context);

    }

    public static DatabaseAccess getInstance(Context context) { // 데이터 베이스 객체 생성 함수
        if (instance == null) {
            instance = new DatabaseAccess(context);

        }
        return instance;
    }

    public void open() {//데이터베이스 읽을 수 있는 권한 부여 함수
        this.db = openHelper.getWritableDatabase();

    }

    public void close() {//데이터 베이스 다 읽고 닫아주는 함수
        if (db != null) {
            this.db.close();
        }
    }

    public ArrayList<String> getmenu(String name) { //재료를 name 매개변수로 받으면 query문을 통해 menu를 출력해주는 함수
        c = db.rawQuery("select menu from recipe_version2 where menu ='" + name + "'" , new String[]{});
        ArrayList<String>search_menu = new ArrayList<>();
        while (c.moveToNext()) {
            String menu = c.getString(0);
            search_menu.add(c.getString(0));;
        }
        return search_menu;
    }

    public ArrayList<String> viewmenu() { //재료를 name 매개변수로 받으면 query문을 통해 menu를 출력해주는 함수
        int i=0;
        c = db.rawQuery("select * from recipe_version2" , new String[]{});
        ArrayList<String>menu = new ArrayList<>();
        while (c.moveToNext()) {
            menu.add(c.getString(0));
        }
        return menu;
    }

}
