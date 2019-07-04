package com.thaliees.navigationactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Define toolbar
        Toolbar toolbar = findViewById(R.id.secondToolbar);
        // Call the activity's setSupportActionBar() method, and pass the activity's toolbar.
        // This method sets the toolbar as the app bar for the activity.
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onSupportNavigateUp() {
        // This method call onBackPressed and returns to the previous activity
        super.onBackPressed();
        return true;
    }
}
