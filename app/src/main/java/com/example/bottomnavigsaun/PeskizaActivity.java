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

public class PeskizaActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    TextView textView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peskiza);
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
                    Intent intent1 = new Intent(PeskizaActivity.this, MainActivity.class);
                    startActivity(intent1);
                    break;

                case R.id.navigation_favorite:
                    Intent intent2 = new Intent(PeskizaActivity.this, FavorituActivity.class);
                    startActivity(intent2);
                    break;


                case R.id.navigation_notifications:
                    Intent intent3 = new Intent(PeskizaActivity.this, NotifikasaunActivity.class);
                    startActivity(intent3);
                    break;

                case R.id.navigation_search:
                    break;

            }
            return  false;
        }
    };
}

//tu tok o nia tlf ba tun koko tok
//ok