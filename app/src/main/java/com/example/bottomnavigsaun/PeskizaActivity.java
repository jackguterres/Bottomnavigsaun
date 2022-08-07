package com.example.bottomnavigsaun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PeskizaActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peskiza);

        overridePendingTransition(0,0);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById( R.id.bottom_navigation );
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
            menuItem.setChecked( true );

        bottomNavigationView.setOnNavigationItemSelectedListener( new BottomNavigationView.OnNavigationItemSelectedListener() {

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
            return  true;
        }
    });
 }
}