package com.example.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnHome, btnProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHome = (Button)findViewById(R.id.btnHome);
        btnProfile = (Button)findViewById(R.id.btnProfile);
        btnHome.setOnClickListener(listener);
        btnProfile.setOnClickListener(listener);
        HomeFragment home = new HomeFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, home)
                .commit();
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnHome:
                    HomeFragment home = new HomeFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frameLayout, home)
                            .commit();
                    break;
                case R.id.btnProfile:
                    ProfileFragment profile = new ProfileFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frameLayout, profile)
                            .commit();
                    break;
            }
        }
    };
}