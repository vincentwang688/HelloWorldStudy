package com.vincentwang.study.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.vincentwang.study.R;

/**
 * Created by vincentwang on 2018/4/5.
 */

public class ViewAnimationActivity extends AppCompatActivity {
    Button alphaBtn;
    Button scaleBtn;
    Button rotateBtn;
    Button translateBtn;
    Button setBtn;
    TextView tv;

    Animation alphaAnimation;
    Animation scaleAnimation;
    Animation rotateAnimation;
    Animation translateAnimation;
    Animation setAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_animation);

        initCtrl();

        initAnimation();

        initBtnListener();

    }

    private void initCtrl() {
        alphaBtn = (Button) findViewById(R.id.btn_alpha_anim);
        scaleBtn = (Button) findViewById(R.id.btn_scale_anim);
        rotateBtn = (Button) findViewById(R.id.btn_rotate_anim);
        translateBtn = (Button) findViewById(R.id.btn_translate_anim);
        setBtn = (Button) findViewById(R.id.btn_set_anim);
        tv = (TextView) findViewById(R.id.tv);
    }

    private void initAnimation() {
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_alpha);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_scale);
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_rotate);
        translateAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_translate);
        setAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_set);
    }

    private void initBtnListener() {
        alphaBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                tv.startAnimation(alphaAnimation);
            }
        });

        scaleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tv.startAnimation(scaleAnimation);
            }
        });

        rotateBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tv.startAnimation(rotateAnimation);
            }
        });

        translateBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tv.startAnimation(translateAnimation);
            }
        });

        setBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tv.startAnimation(setAnimation);
            }
        });
    }
}
