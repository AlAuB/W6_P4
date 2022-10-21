package com.example.w6_p4;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button one, two;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        imageView = findViewById(R.id.pic);

        one.setOnClickListener(view -> {
            AnimationSet animationSet = new AnimationSet(true);
            //0-5 second fade to 0.5 alpha
            Animation animationFade = AnimationUtils.loadAnimation(this, R.anim.fade);
            animationSet.addAnimation(animationFade);
            //1-3 second rotate 2 times (center)
            Animation animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate_two_times);
            animationRotate.setStartOffset(1000);
            animationSet.addAnimation(animationRotate);
            //6-10 slide down then back to center
            Animation animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down_2_second);
            animationSlideDown.setStartOffset(6000);
            Animation animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up_2_second);
            animationSlideUp.setStartOffset(8000);
            animationSet.addAnimation(animationSlideDown);
            animationSet.addAnimation(animationSlideUp);

            imageView.startAnimation(animationSet);
        });

        two.setOnClickListener(view -> {
            AnimationSet animationSet = new AnimationSet(true);
            // 0-2 second zoom-out 2 * size
            Animation animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out);
            animationSet.addAnimation(animationZoomOut);
            //1-4 second rotate 3 times (lower left corner)
            Animation animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate_three_times);
            animationRotate.setStartOffset(1000);
            animationSet.addAnimation(animationRotate);
            // 5-6 second slide down and back to center
            Animation animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down);
            animationSlideDown.setStartOffset(6000);
            Animation animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
            animationSlideUp.setStartOffset(6500);
            animationSet.addAnimation(animationSlideDown);
            animationSet.addAnimation(animationSlideUp);
            // 6-7 second slide left and back to center
            Animation animationLeft = AnimationUtils.loadAnimation(this, R.anim.slide_left);
            animationLeft.setStartOffset(7000);
            Animation animationRight = AnimationUtils.loadAnimation(this, R.anim.slide_right);
            animationRight.setStartOffset(7500);
            animationSet.addAnimation(animationLeft);
            animationSet.addAnimation(animationRight);
            // 7-8 second slide Up and back to center
            Animation animationSlideUp2 = AnimationUtils.loadAnimation(this, R.anim.slide_up);
            animationSlideUp2.setStartOffset(8000);
            Animation animationSlideDown2 = AnimationUtils.loadAnimation(this, R.anim.slide_down);
            animationSlideDown2.setStartOffset(8500);
            animationSet.addAnimation(animationSlideUp2);
            animationSet.addAnimation(animationSlideDown2);
            // 7-8 second zoom-in to origin size
            Animation animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
            animationZoomIn.setStartOffset(8000);
            animationSet.addAnimation(animationZoomIn);

            imageView.startAnimation(animationSet);
        });
    }
}