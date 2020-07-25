package com.example.tablayoutframelayoutandfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
  EditText e1,e2;
  Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String email = e2.getText().toString();
                Intent i=new Intent(SecondActivity.this,ThirdActivity.class);
                i.putExtra("name1",name);
                i.putExtra("name2",email);
                startActivity(i);



            }
        });
    }
}