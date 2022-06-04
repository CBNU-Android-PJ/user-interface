package com.practice.loginregister;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRefrigeratorAdapter extends BaseAdapter {
    private static final int ITEM_VIEW_TYPE_STRS = 0;
    //  private static final int ITEM_VIEW_TYPE_IMGS = 1;
    // private static final int ITEM_VIEW_TYPE_MAX = 2;

    // 아이템 데이터 리스트.
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();


    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return listViewItemList.size();
    }

   // @Override
 //  public int getViewTypeCount() {
   //     return ITEM_VIEW_TYPE_MAX;
//    }

    // position 위치의 아이템 타입 리턴.
    @Override
    public int getItemViewType(int position) {
        return listViewItemList.get(position).getType();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();
        int viewType = getItemViewType(position);

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
            ListViewItem listViewItem = listViewItemList.get(position);

            switch (viewType) {
                case ITEM_VIEW_TYPE_STRS:
                    convertView = inflater.inflate(R.layout.item_recyclerview,
                            parent, false);
                    TextView ingredientTextView = (TextView) convertView.findViewById(R.id.ingredient);
                    TextView massageTextView = (TextView) convertView.findViewById(R.id.message);

                    ingredientTextView.setText(listViewItem.getIngredient());
                    massageTextView.setText(listViewItem.getExpiry());
                    break;

            }
        }

        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴
    @Override
    public long getItemId(int position) {
        return position;
    }

    // 지정한 위치(position)에 있는 데이터 리턴
    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    // 아이템 추가를 위한 함수.
    public void addItem(String ingredient, String Expiry) {
        ListViewItem item = new ListViewItem();

        item.setType(ITEM_VIEW_TYPE_STRS);
        item.setIngredient(ingredient);
        item.setExpiry(Expiry);

        listViewItemList.add(item);
    }
}
