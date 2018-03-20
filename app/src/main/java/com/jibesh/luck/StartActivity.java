package com.jibesh.luck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {
    public String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setting the layout. i.e. connecting the layout with the activity
        setContentView(R.layout.activity_start);
        //setting the username variable to the text entered in the TextView
        //userName = (String) usernameTextView.getText();

    }

     public void onClickStart(View view){
        Intent intent = new Intent(this,GameActivity.class);
        TextView usernameTextView = (TextView) findViewById(R.id.userName);
        userName =  usernameTextView.getText().toString();
        intent.putExtra("userName",userName);
        startActivity(intent);
    }



}
