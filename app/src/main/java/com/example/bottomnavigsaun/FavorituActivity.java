package com.example.bottomnavigsaun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavorituActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    TextView textView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritu);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        textView = findViewById(R.id.text_view);
        frameLayout = findViewById(R.id.frame_container);
        bottomNavigationView.setOnNavigationItemSelectedListener(nav);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener nav
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){

                case R.id.navigation_home:
                    Intent intent1 = new Intent(FavorituActivity.this, MainActivity.class);
                    startActivity(intent1);
                    break;

                case R.id.navigation_favorite:
                    break;


                case R.id.navigation_notifications:
                    Intent intent2 = new Intent(FavorituActivity.this, NotifikasaunActivity.class);
                    startActivity(intent2);
                    break;

                case R.id.navigation_search:
                    Intent intent3 = new Intent(FavorituActivity.this, PeskizaActivity.class);
                    startActivity(intent3);
                    break;

            }
            return  false;
        }
    };
}