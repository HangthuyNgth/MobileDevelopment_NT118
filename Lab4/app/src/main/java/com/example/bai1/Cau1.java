package com.example.bai1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Cau1 extends AppCompatActivity {
    private Button btnFadeInXml, btnFadeInCode, btnFadeOutXml, btnFadeOutCode,
            btnBlinkXml, btnBlinkCode, btnZoomInXml, btnZoomInCode, btnZoomOutXml,
            btnZoomOutCode, btnRotateXml, btnRotateCode, btnMoveXml, btnMoveCode,
            btnSlideUpXml, btnSlideUpCode, btnBounceXml, btnBounceCode, btnCombineXml,
            btnCombineCode;

    private ImageView ivUitLogo;
    private Animation.AnimationListener animationListener;

    private void findViewsByIds() {
        ivUitLogo = findViewById(R.id.iv_uit_logo);
        btnFadeInXml = findViewById(R.id.btn_fade_in_xml);
        btnFadeInCode = findViewById(R.id.btn_fade_in_code);
        btnFadeOutXml = findViewById(R.id.btn_fade_out_xml);
        btnFadeOutCode = findViewById(R.id.btn_fade_out_code);
        btnBlinkXml = findViewById(R.id.btn_blink_xml);
        btnBlinkCode = findViewById(R.id.btn_blink_code);
        btnZoomInXml = findViewById(R.id.btn_zoom_in_xml);
        btnZoomInCode = findViewById(R.id.btn_zoom_in_code);
        btnZoomOutXml = findViewById(R.id.btn_zoom_out_xml);
        btnZoomOutCode = findViewById(R.id.btn_zoom_out_code);
        btnRotateXml = findViewById(R.id.btn_rotate_xml);
        btnRotateCode = findViewById(R.id.btn_rotate_code);
        btnMoveXml = findViewById(R.id.btn_move_xml);
        btnMoveCode = findViewById(R.id.btn_move_code);
        btnSlideUpXml = findViewById(R.id.btn_slide_up_xml);
        btnSlideUpCode = findViewById(R.id.btn_slide_up_code);
        btnBounceXml = findViewById(R.id.btn_bounce_xml);
        btnBounceCode = findViewById(R.id.btn_bounce_code);
        btnCombineXml = findViewById(R.id.btn_combine_xml);
        btnCombineCode = findViewById(R.id.btn_combine_code);
    }

    private void initVariables() {
        animationListener = new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Do something when the animation starts
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(getApplicationContext(), "Animation Stopped", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Do something when the animation repeats
            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau1);

        findViewsByIds();
        initVariables();

        final Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);
        fadeInAnimation.setAnimationListener(animationListener);

        btnFadeInXml.setOnClickListener(v -> ivUitLogo.startAnimation(fadeInAnimation));

        btnFadeInCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_fade_in);
            ivUitLogo.startAnimation(animation);
        });

        btnFadeOutXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_fade_out);
            ivUitLogo.startAnimation(animation);
        });

        btnFadeOutCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_fade_out);
            ivUitLogo.startAnimation(animation);
        });

        btnBlinkXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_blink);
            ivUitLogo.startAnimation(animation);
        });

        btnBlinkCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_blink);
            ivUitLogo.startAnimation(animation);
        });

        btnZoomInXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_zoom_in);
            ivUitLogo.startAnimation(animation);
        });

        btnZoomInCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_zoom_in);
            ivUitLogo.startAnimation(animation);
        });

        btnZoomOutXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_zoom_out);
            ivUitLogo.startAnimation(animation);
        });

        btnZoomOutCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_zoom_out);
            ivUitLogo.startAnimation(animation);
        });

        btnRotateXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_rotate);
            ivUitLogo.startAnimation(animation);
        });

        btnRotateCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_rotate);
            ivUitLogo.startAnimation(animation);
        });

        btnMoveXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_move);
            ivUitLogo.startAnimation(animation);
        });

        btnMoveCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_move);
            ivUitLogo.startAnimation(animation);
        });

        btnSlideUpXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_slide_up);
            ivUitLogo.startAnimation(animation);
        });

        btnSlideUpCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_slide_up);
            ivUitLogo.startAnimation(animation);
        });

        btnBounceXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_bounce);
            ivUitLogo.startAnimation(animation);
        });

        btnBounceCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_bounce);
            ivUitLogo.startAnimation(animation);
        });

        btnCombineXml.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_combine);
            ivUitLogo.startAnimation(animation);
        });

        btnCombineCode.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(Cau1.this, R.anim.anim_combine);
            ivUitLogo.startAnimation(animation);
        });

        ivUitLogo.setOnClickListener(v -> {
            Intent iNewActivity = new Intent(Cau1.this, Cau3.class);
            startActivity(iNewActivity);
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
        });
    }
}
