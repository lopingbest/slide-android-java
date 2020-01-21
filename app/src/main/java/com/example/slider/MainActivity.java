package com.example.slider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new
         View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 PrefManager prefManager = new
                         PrefManager(getApplicationContext());
                 prefManager.setFirstTimeLaunch(true);
                 startActivity(new Intent(MainActivity.this,
                         WelcomeActivity.class));
                 finish();
             }
         });
    }
}