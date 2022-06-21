package com.example.whattododo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    SettingsFragment settingsFragment = new SettingsFragment();
    NotesFragment notificationFragment = new NotesFragment();
    ScheduleFragment scheduleFragment = new ScheduleFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView  = findViewById(R.id.bottom_navigation);

        /*getSupportFragmentManager().beginTransaction().add(R.id.container, new ScheduleFragment()).commit();*/

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        // ---Notification icon---
        //BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.notes);
        //badgeDrawable.setVisible(true);
        //badgeDrawable.setNumber(8);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;
                    case R.id.notes:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,notificationFragment).commit();
                        return true;
                    case R.id.schedule:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,scheduleFragment).commit();
                        return true;
                    case R.id.settings:
                        //getSupportFragmentManager().beginTransaction().replace(R.id.container,settingsFragment).commit();
                        //getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferencesActivity.MyPreferenceFragment()).commit();
                        Intent i = new Intent(MainActivity.this, MyPreferencesActivity.class);
                        startActivity(i);
                        return true;
                }

                return false;
            }
        });
    }
}