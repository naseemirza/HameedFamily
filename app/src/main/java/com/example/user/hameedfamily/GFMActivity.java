package com.example.user.hameedfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GFMActivity extends AppCompatActivity {


         TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gfm);

        textView=(TextView)findViewById(R.id.nexttext);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GFMActivity.this,FBFActivity.class));
            }
        });
    }
}
