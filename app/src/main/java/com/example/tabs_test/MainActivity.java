package com.example.tabs_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tab = findViewById(R.id.tabLayout);
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                int position = tab.getPosition();
                switch(position){
                    case 0:
                        // Handle tab 1 select
                        Toast.makeText(MainActivity.this, "tab 1 selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        // Handle tab 2 select
                        Toast.makeText(MainActivity.this, "tab 2 selected", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Handle tab unselect
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Handle tab reselect
            }
        });


    }
}