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

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    TextView textView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        textView = findViewById(R.id.text_view);
        frameLayout = findViewById(R.id.frame_container);

        frameLayout.setBackgroundColor(Color.CYAN);
        textView.setText("Home");
        bottomNavigationView.setOnNavigationItemSelectedListener(nav);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener nav
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){

                case R.id.navigation_home:
                    break;

                case R.id.navigation_favorite:
                    Intent intent1 = new Intent(MainActivity.this, FavorituActivity.class);
                    startActivity(intent1);
                    break;


                case R.id.navigation_notifications:
                    Intent intent2 = new Intent(MainActivity.this, NotifikasaunActivity.class);
                    startActivity(intent2);
                    break;

                case R.id.navigation_search:
                    Intent intent3 = new Intent(MainActivity.this, PeskizaActivity.class);
                    startActivity(intent3);
                    break;

            }
            return  false;
        }
    };
}