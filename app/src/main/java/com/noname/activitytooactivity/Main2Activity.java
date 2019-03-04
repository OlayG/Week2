package com.noname.activitytooactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    // Butterknife annotation to get view from xml
    @BindView(R.id.tv_data)
    AppCompatTextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Number ONE MOST IMPORTANT LINE FOR BUTTERKNIFE!@#!@#@!!@#!@!@#!@!@#!@#!@#
        ButterKnife.bind(this);

        // This if statement checks if getIntent() has a value for key(NAME) provided
        if (getIntent().hasExtra("NAME")) {
            // This gets the value from the getIntent()
            String name = getIntent().getStringExtra("NAME");
            // This sets text to display
            tvData.setText(name);
        }

        // Toast to show we are in a new activity
        Toast.makeText(this, "We are in Activity 2!!!!", Toast.LENGTH_SHORT).show();
    }
}
