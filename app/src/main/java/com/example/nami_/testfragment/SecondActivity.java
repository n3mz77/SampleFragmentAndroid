package com.example.nami_.testfragment;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    public static final String FRAGMENT_1 = "fragment1";
    public static final String FRAGMENT_2 = "fragment2";
    public static final String FRAGMENT_3 = "fragment3";
    public static final String START_PAGE = "page";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acitivity);
        Intent intent = getIntent();
        String page = intent.getStringExtra(START_PAGE);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (page) {
            case FRAGMENT_2:
                transaction.add(R.id.frame_container, new Fragment2(), null);
                break;
            case FRAGMENT_3:
                transaction.add(R.id.frame_container, new Fragment3(), null);
                break;
            case FRAGMENT_1:
            default:
                transaction.add(R.id.frame_container, new Fragment1(), null);
                    break;
        }

        transaction.commit();
    }
}
