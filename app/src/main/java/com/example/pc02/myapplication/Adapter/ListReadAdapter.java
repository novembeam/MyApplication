package com.example.pc02.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.pc02.myapplication.OnTapListener;
import com.example.pc02.myapplication.R;

public class ListReadAdapter extends BaseAdapter {

    private int pictures[];
    private Context context;
    private LayoutInflater inflater;

    //private OnTapListener onTapListener;

    public ListReadAdapter(Context context, int pictures[]) {
        this.context=context;
        this.pictures=pictures;
        //this.onTapListener=onTapListener;
    }

    @Override
    public int getCount() {
        return pictures.length;
    }

    @Override
    public Object getItem(int position) {
        return pictures[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View gridViewpicture = convertView;

            if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridViewpicture = inflater.inflate(R.layout.custom_layoutread, null);// เป็นการเขียนview ใหม่ลงบน layout ของ custom_layoutread
        }

        ImageView picture = gridViewpicture.findViewById(R.id.menu); // เป็นการนำ array[] ของ int pictures[] มาใส่ใน Imageview ของ Id:menu ใน custom_layoutread
        picture.setImageResource(pictures[position]); //  set รูปภาพใส่ใน array โดยใน array[] อยู่ใน List_ReadActivity ตรง int picture[]


        return gridViewpicture;
    }
}
