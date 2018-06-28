package com.example.pc02.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pc02.myapplication.Adapter.ListReadAdapter;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_abcActivity;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_colActivity;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_dayActivity;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_monthActivity;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_numActivity;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_payunchana;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_saraActivity;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_shapeActivity;


public class List_ReadActivity extends Activity {

    ImageView back;
    GridView gridView;

    int pictures[] = {R.drawable.listread1, R.drawable.listread2, R.drawable.listread3,
            R.drawable.listread4, R.drawable.listread5, R.drawable.listread6,
            R.drawable.listread7, R.drawable.listread8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_list__read);

        gridView = findViewById(R.id.gridview1);

        ListReadAdapter adapter = new ListReadAdapter(List_ReadActivity.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();

                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(List_ReadActivity.this, r_payunchana.class);
                        break;

                        case 1: intent = new Intent(List_ReadActivity.this, r_saraActivity.class);break;
                        case 2: intent = new Intent(List_ReadActivity.this, r_abcActivity.class);break;
                        case 3: intent = new Intent(List_ReadActivity.this, r_numActivity.class);break;
                        case 4: intent = new Intent(List_ReadActivity.this, r_dayActivity.class);break;
                        case 5: intent = new Intent(List_ReadActivity.this, r_monthActivity.class);break;
                        case 6: intent = new Intent(List_ReadActivity.this, r_colActivity.class);break;
                        case 7: intent = new Intent(List_ReadActivity.this, r_shapeActivity.class);break;

                }
                startActivity(intent);
            }
        });

        onbackPressed();
    }

    private void onbackPressed() {
        back =findViewById(R.id.btBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onbackPressed();
                finish();
            }
        });
    }
}
