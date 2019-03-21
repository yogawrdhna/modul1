package com.example.rakhasehat.radiocolor;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    RadioButton rdb1, rdb2, rdb3, rdb4, rdb5, rdb6, rdb7, rdb8;
    TextView txtwarna;
    Button btnexit;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdb1 = (RadioButton) findViewById(R.id.rdb1);
        rdb2 = (RadioButton) findViewById(R.id.rdb2);
        rdb3 = (RadioButton) findViewById(R.id.rdb3);
        rdb4 = (RadioButton) findViewById(R.id.rdb4);
        rdb5 = (RadioButton) findViewById(R.id.rdb5);
        rdb6 = (RadioButton) findViewById(R.id.rdb6);
        rdb7 = (RadioButton) findViewById(R.id.rdb7);
        rdb8 = (RadioButton) findViewById(R.id.rdb8);
        txtwarna = (TextView) findViewById(R.id.txtwarna);
        btnexit = (Button) findViewById(R.id.btnexit);
        rdb1.setOnClickListener(this);
        rdb2.setOnClickListener(this);
        rdb3.setOnClickListener(this);
        rdb4.setOnClickListener(this);
        rdb5.setOnClickListener(this);
        rdb6.setOnClickListener(this);
        rdb7.setOnClickListener(this);
        rdb8.setOnClickListener(this);
        btnexit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v == btnexit){
            finish();
        }
        else if (v == rdb1){
            txtwarna.setBackgroundResource(R.color.backRed);
        }
        else if (v == rdb2){
            txtwarna.setBackgroundResource(R.color.backGreen);
        }
        else if(v == rdb3){
            txtwarna.setBackgroundResource(R.color.backBlue);
        }
        else if(v == rdb4){
            txtwarna.setBackgroundResource(R.color.backWhite);
        }
        else if(v == rdb5){
            txtwarna.setBackgroundResource(R.color.backYellow);
        }
        else if(v == rdb6){
            txtwarna.setBackgroundResource(R.color.backDark);
        }
        else if(v == rdb7){
            txtwarna.setBackgroundResource(R.color.backPink);
        }
        else if(v == rdb8){
            txtwarna.setBackgroundResource(R.color.backCayon);
        }
    }
}
