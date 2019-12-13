package com.czh.line;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

import com.czh.line.widget.Line;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Line line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        line = findViewById(R.id.line);

        ArrayList<String> arrayListx = new ArrayList<String>();
        arrayListx.add("02时");
        arrayListx.add("05时");
        arrayListx.add("08时");
        arrayListx.add("11时");
        arrayListx.add("14时");
        arrayListx.add("17时");
        arrayListx.add("20时");
        arrayListx.add("23时");
        line.setxValues(arrayListx);

        ArrayList<Float> arrayList = new ArrayList<Float>();
        arrayList.add(22f);
        arrayList.add(23f);
        arrayList.add(23f);
        arrayList.add(24f);
        arrayList.add(22f);
        arrayList.add(21f);
        arrayList.add(21f);
        arrayList.add(19f);

        line.setValues(arrayList);
        line.setChange();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ArrayList<String> arrayListx2 = new ArrayList<String>();
                arrayListx2.add("02时");
                arrayListx2.add("05时");
                arrayListx2.add("08时");
                arrayListx2.add("11时");
                arrayListx2.add("14时");
                arrayListx2.add("17时");
                arrayListx2.add("20时");
                arrayListx2.add("23时");
                line.setxValues(arrayListx2);

                ArrayList<Float> arrayList2 = new ArrayList<Float>();
                arrayList2.add(20f);
                arrayList2.add(20f);
                arrayList2.add(18f);
                arrayList2.add(17f);
                arrayList2.add(16f);
                arrayList2.add(16f);
                arrayList2.add(18f);
                arrayList2.add(19f);
                line.setValues(arrayList2);
                line.setChange();
            }
        }, 3000);
    }
}
