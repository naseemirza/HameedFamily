package com.example.user.hameedfamily;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Splash extends AppCompatActivity {


    Thread splashTread;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        StartAnimation();

    }
    private void StartAnimation() {

        Animation animation= AnimationUtils.loadAnimation(this, R.anim.alpha);
        animation.reset();
        LinearLayout l= (LinearLayout) findViewById(R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(animation);

        animation=AnimationUtils.loadAnimation(this,R.anim.translate);
        animation.reset();

        ImageView imageView=(ImageView)findViewById(R.id.splash);
        imageView.clearAnimation();
        imageView.startAnimation(animation);

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 3500) {
                        sleep(100);
                        waited += 100;
                    }
                    Intent intent = new Intent(Splash.this,
                            MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    Splash.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    Splash.this.finish();
                }

            }
        };
        splashTread.start();

    }

}
