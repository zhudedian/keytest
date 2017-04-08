package com.ider.keytest;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnKeyListener{
    private Button test;
    private TextView textUp,textDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar= getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        test = (Button) findViewById(R.id.key_test);
        textUp= (TextView) findViewById(R.id.text_up) ;
        textDown = (TextView) findViewById(R.id.text_down);
        test.setOnKeyListener(this);
    }

    @Override
    public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
//        Log.i("key",keyCode+"   "+keyEvent);
//        textView.setText(keyCode+""+keyEvent);
        return false;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
        Log.i("key",keyCode+":   "+keyEvent);
        textDown.setText("keyCode="+keyCode+"\n"+"keyEvent="+keyEvent);
        return false;
    }
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent keyEvent) {
        Log.i("key",keyCode+":   "+keyEvent);
        textUp.setText("keyCode="+keyCode+"\n"+"keyEvent="+keyEvent);
        return false;
    }
}
