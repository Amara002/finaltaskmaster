package com.example.taskmaster;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getActionBar();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeButtonEnabled(true);

        Button addTaskButton =findViewById(R.id.button);
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addTaskPage=new Intent(MainActivity.this,AddTaskActivity.class);
                startActivity(addTaskPage);
            }
        });

        Button showAllTasks= findViewById(R.id.button3);
        showAllTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showAllTasks=new Intent(MainActivity.this,AllTaskActivity.class);
                startActivity(showAllTasks);
            }
        });
    }

    public void clickbutton4(View view) {
        Intent couseDetail = new Intent(this,TaskDetailsActivity.class);
        couseDetail.putExtra("title", "java");
        startActivity(couseDetail);
    }

    public void clickbutton5(View view) {
        Intent couseDetail = new Intent(this,TaskDetailsActivity.class);
        couseDetail.putExtra("title", "c++");
        startActivity(couseDetail);

    }

    public void clickbutton6(View view) {
        Intent couseDetail = new Intent(this,TaskDetailsActivity.class);
        couseDetail.putExtra("title", "javascript");
        startActivity(couseDetail);
    }

    @Override
    public void onResume() {

        super.onResume();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        TextView address = findViewById(R.id.textView);
        address.setText(preferences.getString("nameKey", "") + "'s Task");
    }

    public void clicksetting(View view) {
        Intent clicksetting = new Intent(MainActivity.this, SettingActivity.class);
        MainActivity.this.startActivity(clicksetting);
    }
}