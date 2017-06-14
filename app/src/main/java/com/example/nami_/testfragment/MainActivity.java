package com.example.nami_.testfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_fragment1).setOnClickListener(this);
        findViewById(R.id.btn_fragment2).setOnClickListener(this);
        findViewById(R.id.btn_fragment3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        String page ;
        switch (v.getId()) {
            case R.id.btn_fragment2:
                page = SecondActivity.FRAGMENT_2;
                break;
            case R.id.btn_fragment3:
                page = SecondActivity.FRAGMENT_3;
                break;
            case R.id.btn_fragment1:
            default:
                page = SecondActivity.FRAGMENT_1;
                break;
        }
        intent.putExtra(SecondActivity.START_PAGE, page);
        startActivity(intent);
    }
}
