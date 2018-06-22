package com.example.user.hameedfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FBFActivity extends AppCompatActivity {

    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4,linearLayout5,linearLayout6,linearLayout7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fbf);

        linearLayout1=(LinearLayout)findViewById(R.id.li1);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FBFActivity.this,ChildActivity1.class));
            }
        });


        linearLayout2=(LinearLayout)findViewById(R.id.li2);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FBFActivity.this,ChildsActivity2.class));
            }
        });


        linearLayout3=(LinearLayout)findViewById(R.id.li3);
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FBFActivity.this,ChildsActivity3.class));
            }
        });

        linearLayout4=(LinearLayout)findViewById(R.id.li4);
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FBFActivity.this,ChildsActivity4.class));
            }
        });

        linearLayout5=(LinearLayout)findViewById(R.id.li5);
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FBFActivity.this,ChildsActivity5.class));
            }
        });
    }
}
