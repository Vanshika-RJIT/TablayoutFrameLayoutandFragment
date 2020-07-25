package com.example.tablayoutframelayoutandfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
     TabLayout t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.tabLayout);
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment_01 ft_01 = new Fragment_01();
        ft.replace(R.id.frame_layout,ft_01);
        ft.commit();
       t.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               switch(tab.getPosition())
               {
                   case 0:
                       FragmentManager fm4=getSupportFragmentManager();
                       FragmentTransaction ft4 = fm4.beginTransaction();
                       Fragment_01 ft_01 = new Fragment_01();
                       ft4.replace(R.id.frame_layout,ft_01);
                       ft4.commit();
                       break;
                   case 1:
                       FragmentManager fm1=getSupportFragmentManager();
                       FragmentTransaction ft1 = fm1.beginTransaction();
                       Fragment_02 ft_02 = new Fragment_02();
                       ft1.replace(R.id.frame_layout,ft_02);
                       ft1.commit();
                       break;
                   case 2:
                       FragmentManager fm2=getSupportFragmentManager();
                       FragmentTransaction ft2 = fm2.beginTransaction();
                       Fragment_03 ft_03 = new Fragment_03();
                       ft2.replace(R.id.frame_layout,ft_03);
                       ft2.commit();
                       break;
                   case 3:
                       Intent i=new Intent(MainActivity.this,SecondActivity.class);
                       startActivity(i);

               }
           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });
    }
}