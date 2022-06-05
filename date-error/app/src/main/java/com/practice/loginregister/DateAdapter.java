package com.practice.loginregister;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DateAdapter extends BaseAdapter {
    private static final int ITEM_VIEW_TYPE_STRS = 0;
    //  private static final int ITEM_VIEW_TYPE_IMGS = 1;
    // private static final int ITEM_VIEW_TYPE_MAX = 2;

    // 아이템 데이터 리스트.
    private ArrayList<ListViewItem> listViewItemList1 = new ArrayList<ListViewItem>();


    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return listViewItemList1.size();
    }

    // @Override
    //  public int getViewTypeCount() {
    //     return ITEM_VIEW_TYPE_MAX;
//    }

    // position 위치의 아이템 타입 리턴.
    @Override
    public int getItemViewType(int position) {
        return listViewItemList1.get(position).getType();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();
        int viewType = getItemViewType(position);

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
            ListViewItem listViewItem1 = listViewItemList1.get(position);
//////////////////////////////////////기간 임박할경우 나누기 위해 스위치문 으로 일단 구현
            switch (viewType) {
                case ITEM_VIEW_TYPE_STRS:
                    convertView = inflater.inflate(R.layout.date_item_recycler,
                            parent, false);
                    TextView ingredientTextView = (TextView) convertView.findViewById(R.id.date_ingredient);
                    TextView massageTextView = (TextView) convertView.findViewById(R.id.date_message);

                    ingredientTextView.setText(listViewItem1.getIngredient());
                    massageTextView.setText(listViewItem1.getExpiry());
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
        return listViewItemList1.get(position);
    }


}