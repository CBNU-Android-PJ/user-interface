package com.cookandroid.mainscreen;
//사용자 버튼 동작
import android.app.Activity;

public class User_Btn extends Activity {
    //사용자 이름
    String userName;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public User_Btn (String userName) {
        this.userName = userName;
    }
}
