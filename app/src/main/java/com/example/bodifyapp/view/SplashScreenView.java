package com.example.bodifyapp.view;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.bodifyapp.R;

public class SplashScreenView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_view);

        TextView textView = findViewById(R.id.textView);
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        textView.startAnimation(fadeOut);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenView.this, IntroView.class);
                startActivity(intent);
                finish();
            }
        }, 2000); // 2 seconds delay
    }
}
