package com.example.pc02.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pc02.myapplication.Adapter.ListVideoAdapter;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_dayActivity;
import com.example.pc02.myapplication.Adapter2.OtherGridviewManager.r_monthActivity;
import com.example.pc02.myapplication.VIDEO.Thank_Activity;
import com.example.pc02.myapplication.VIDEO.v_abcActivity;
import com.example.pc02.myapplication.VIDEO.v_colActivity;
import com.example.pc02.myapplication.VIDEO.v_dayActivity;
import com.example.pc02.myapplication.VIDEO.v_monthActivity;
import com.example.pc02.myapplication.VIDEO.v_numActivity;
import com.example.pc02.myapplication.VIDEO.v_payunchanaActivity;
import com.example.pc02.myapplication.VIDEO.v_saraActivity;
import com.example.pc02.myapplication.VIDEO.v_shapeActivity;


public class List_VideoActivity extends Activity {

    ImageView back;
    GridView gridView;

    int pictures[] = {R.drawable.listread1, R.drawable.listread2, R.drawable.listread3,
            R.drawable.listread4, R.drawable.listread5, R.drawable.listread6,
            R.drawable.listread7, R.drawable.listread8};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__video);

        gridView = findViewById(R.id.gridview1);

        ListVideoAdapter adapter = new ListVideoAdapter(List_VideoActivity.this,pictures); //นำการทำงานใน ListReadAdapter ส่งมาที่ picture โดยจะเขียนการแสดงใหม่
        gridView.setAdapter(adapter); // เซทอแดปเตอร์ให้แสดงผลที่ gridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(List_ReadActivity.this,"" + position,Toast.LENGTH_SHORT).show();

                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(List_VideoActivity.this, v_payunchanaActivity.class);
                        break;

                    case 1: intent = new Intent(List_VideoActivity.this, v_saraActivity.class);break;
                    case 2: intent = new Intent(List_VideoActivity.this, v_abcActivity.class);break;
                    case 3: intent = new Intent(List_VideoActivity.this, v_numActivity.class);break;
                    case 4: intent = new Intent(List_VideoActivity.this, v_dayActivity.class);break;
                    case 5: intent = new Intent(List_VideoActivity.this, v_monthActivity.class);break;
                    case 6: intent = new Intent(List_VideoActivity.this, v_colActivity.class);break;
                    case 7: intent = new Intent(List_VideoActivity.this, v_shapeActivity.class);break;

                }
                startActivity(intent);
            }
        });
        onbackPressed();
        onCreditPress();
    }

    private void onCreditPress() {
        Button credit = findViewById(R.id.btVdoCredit);
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(List_VideoActivity.this, Thank_Activity.class);
                startActivity(intent);
            }
        });
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
