package com.example.tablayoutframelayoutandfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
 TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView4);
        String name=getIntent().getStringExtra("name1");
        String email=getIntent().getStringExtra("name2");
        t1.setText(name);
        t2.setText(email);
    }
}