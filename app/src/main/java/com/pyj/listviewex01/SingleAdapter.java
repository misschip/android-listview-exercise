package com.pyj.listviewex01;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SingleAdapter extends BaseAdapter {
    private static final String TAG = "SingleAdapter";

    private List<Movie> items = new ArrayList<>();

    // 생성자
    public SingleAdapter() {
        items.add(new Movie("써니",R.drawable.mov01));
        items.add(new Movie("완득이",R.drawable.mov02));
        items.add(new Movie("괴물",R.drawable.mov03));
        items.add(new Movie("라디오스타",R.drawable.mov04));
        items.add(new Movie("비열한 거리",R.drawable.mov05));
        items.add(new Movie("왕의 남자",R.drawable.mov06));
        items.add(new Movie("아일랜드",R.drawable.mov07));
        items.add(new Movie("웰컴투동막골",R.drawable.mov08));
        items.add(new Movie("헬보이",R.drawable.mov09));
        items.add(new Movie("백투더퓨쳐",R.drawable.mov10));
        items.add(new Movie("여인의 향기",R.drawable.mov11));
        items.add(new Movie("쥬라기공원",R.drawable.mov12));

    }

    public void addItems(List<Movie> items){
        this.items = items;

    }

    @Override
    public int getCount() {
        Log.d(TAG, "getCount:");
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        Log.d(TAG, "getItem:");
        return items.get(position);
    }

    // 구현 안해도 됨
    @Override
    public long getItemId(int position) {
        Log.d(TAG, "getItemId:");
        return position;
    }

    // 가장 중요한 메서드
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View itemView = inflator.inflate(R.layout.item, parent, false);

        // View  찾기
        TextView tv = itemView.findViewById(R.id.tv_title);
        ImageView iv = itemView.findViewById(R.id.iv_img_resource);

        String title = ((Movie)getItem(position)).getTitle();
        int imgResource = ((Movie)getItem(position)).getImgResource();

        tv.setText(title);
        iv.setImageResource(imgResource);
        return itemView;
    }
}
