package com.jibesh.luck;

/**
 * Till now. When we click three buttons, the result will go to the next activity
 */

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    //Instance Variables
    public boolean[] threeButtonsClicked = new boolean[6];
    public ArrayList<Integer> randomNums  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_game);
        //initialize random numbers
        /*
        randomNums.set(0, (int) (Math.random() * 6));
        randomNums.set(1, (int) (Math.random() * 6));
        randomNums.set(2, (int) (Math.random() * 6));
        */
        //make all the buttons not clicked
        for(int i=0;i<6;i++){
            threeButtonsClicked[i]=false;
        }
    }

    protected void oneClicked(View view){
        Button button = (Button) findViewById(R.id.one);
        /**
         * Here we need to write code for checking whether
         * this number matches any of the numbers in the random array.
         * if it matches, then set colour of button to green
         * else, set the colour of the button to red
         */
        int flag = 0;
        for(int i=0;i<randomNums.size();i++){
            int num = randomNums.get(i);
            if(num == 1) {
                flag = 1;
                randomNums.remove(i);
                break;
            }
        }
        if(flag == 1){
            button.setBackgroundColor(Color.GREEN);
        }
        else {
            button.setBackgroundColor(Color.RED);
        }

        threeButtonsClicked[0] = true;
        checkButtonsClicked();
    }

    protected void twoClicked(View view){
        Button button = (Button) findViewById(R.id.two);
        /**
         * Here we need to write code for checking whether
         * this number matches any of the numbers in the random array.
         * if it matches, then set colour of button to green
         * else, set the colour of the button to red
         */
        int flag = 0;
        for(int i=0;i<randomNums.size();i++){
            int num = randomNums.get(i);
            if(num == 2) {
                flag = 1;
                randomNums.remove(i);
                break;
            }
        }
        if(flag == 1){
            button.setBackgroundColor(Color.GREEN);
        }
        else {
            button.setBackgroundColor(Color.RED);
        }
        threeButtonsClicked[1] = true;
        checkButtonsClicked();
    }

    protected void threeClicked(View view){
        Button button = (Button) findViewById(R.id.three);
        /**
         * Here we need to write code for checking whether
         * this number matches any of the numbers in the random array.
         * if it matches, then set colour of button to green
         * else, set the colour of the button to red
         */
        int flag = 0;
        for(int i=0;i<randomNums.size();i++){
            int num = randomNums.get(i);
            if(num == 3) {
                flag = 1;
                randomNums.remove(i);
                break;
            }
        }
        if(flag == 1){
            button.setBackgroundColor(Color.GREEN);
        }
        else {
            button.setBackgroundColor(Color.RED);
        }
        threeButtonsClicked[2] = true;
        checkButtonsClicked();
    }

    protected void fourClicked(View view){
        Button button = (Button) findViewById(R.id.four);
        /**
         * Here we need to write code for checking whether
         * this number matches any of the numbers in the random array.
         * if it matches, then set colour of button to green
         * else, set the colour of the button to red
         */
        int flag = 0;
        for(int i=0;i<randomNums.size();i++){
            int num = randomNums.get(i);
            if(num == 4) {
                flag = 1;
                randomNums.remove(i);
                break;
            }
        }
        if(flag == 1){
            button.setBackgroundColor(Color.GREEN);
        }
        else {
            button.setBackgroundColor(Color.RED);
        }
        threeButtonsClicked[3] = true;
        checkButtonsClicked();
    }

    protected void fiveClicked(View view){
        Button button = (Button) findViewById(R.id.five);
        /**
         * Here we need to write code for checking whether
         * this number matches any of the numbers in the random array.
         * if it matches, then set colour of button to green
         * else, set the colour of the button to red
         */
        int flag = 0;
        for(int i=0;i<randomNums.size();i++){
            int num = randomNums.get(i);
            if(num == 5) {
                flag = 1;
                randomNums.remove(i);
                break;
            }
        }
        if(flag == 1){
            button.setBackgroundColor(Color.GREEN);
        }
        else {
            button.setBackgroundColor(Color.RED);
        }
        threeButtonsClicked[4] = true;
        checkButtonsClicked();
    }

    protected void sixClicked(View view){
        Button button = (Button) findViewById(R.id.six);
        /**
         * Here we need to write code for checking whether
         * this number matches any of the numbers in the random array.
         * if it matches, then set colour of button to green
         * else, set the colour of the button to red
         */
        int flag = 0;
        for(int i=0;i<randomNums.size();i++){
            int num = randomNums.get(i);
            if(num == 6) {
                flag = 1;
                randomNums.remove(i);
                break;
            }
        }
        if(flag == 1){
            button.setBackgroundColor(Color.GREEN);
        }
        else {
            button.setBackgroundColor(Color.RED);
        }
        threeButtonsClicked[5] = true;
        checkButtonsClicked();
    }

    protected void checkButtonsClicked(){
        int count = 0;
        Intent prevIntent = getIntent();
        String username = prevIntent.getStringExtra("userName");
        Intent intent = new Intent(this, ResultActivity.class);
        for(int i=0;i<6;i++){
            if( threeButtonsClicked[i] == true ){
                count++;
            }
        }
        if(count >= 3){
            intent.putExtra("userName",username);
            startActivity(intent);
        }
    }


}
