package com.example.user.hameedfamily;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChildActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
