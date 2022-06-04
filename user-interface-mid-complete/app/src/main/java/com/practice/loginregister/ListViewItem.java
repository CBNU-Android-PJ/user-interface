package com.practice.loginregister;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    // 아이템 타입을 구분하기 위한 type 변수.
    private int type ;

    private String IngredientStr ;
    private String ExpiryStr ;



    public void setType(int type) {
        this.type = type ;
    }
    public void setIngredient(String Ingredient) {
        IngredientStr = Ingredient ;
    }
    public void setExpiry(String Expiry) {
        ExpiryStr = Expiry ;
    }


    public int getType() {
        return this.type ;
    }

    public String getIngredient() {
        return this.IngredientStr ;
    }
    public String getExpiry() {
        return this.ExpiryStr ;
    }

}