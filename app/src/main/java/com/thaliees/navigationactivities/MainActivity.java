package com.thaliees.navigationactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define the button
        Button button = findViewById(R.id.button);
        button.setOnClickListener(press);
    }

    private View.OnClickListener press = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Initialize the intent
            Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
            // Launch intent
            startActivity(secondActivity);
        }
    };
}
