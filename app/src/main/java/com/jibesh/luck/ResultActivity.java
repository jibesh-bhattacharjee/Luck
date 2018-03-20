package com.jibesh.luck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_result);
        TextView userNameTextView = (TextView) findViewById(R.id.yourName);
        Intent prevIntent = getIntent();
        String userName = prevIntent.getStringExtra("userName");
        userNameTextView.setText(userName);
    }
}
