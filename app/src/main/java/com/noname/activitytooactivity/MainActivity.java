package com.noname.activitytooactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_input)
    EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Number ONE MOST IMPORTANT LINE FOR BUTTERKNIFE!@#!@#@!!@#!@!@#!@!@#!@#!@#
        ButterKnife.bind(MainActivity.this);
    }

    @OnClick(R.id.btn_submit)
    public void onViewClicked() {
        // Code to go to new Activity
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        // Code to pass data to activity
        intent.putExtra("NAME", display.getText().toString());
        // This code starts the activity
        startActivity(intent);
    }
}
