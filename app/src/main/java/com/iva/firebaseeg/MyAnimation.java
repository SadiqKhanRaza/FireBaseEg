package com.iva.firebaseeg;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MyAnimation extends AppCompatActivity {

    ImageView imageView;
    Animation an,ani,ani2,ani3;
    AnimationDrawable ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        imageView=findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.item_list);
        //ad=(AnimationDrawable) imageView.getBackground();
        an= AnimationUtils.loadAnimation(MyAnimation.this,R.anim.my_animation);//By XML
        //By Java Code
        ani=new TranslateAnimation(0,100,0,0);

       final AnimationSet as= new AnimationSet(true);
        ani.setDuration(1000);
        ani.setRepeatCount(2);
        //as.addAnimation(ani);
        ani2=new RotateAnimation(0,90);
        //ani2.setRepeatCount(2);
        ani2.setDuration(2000);
        ani3=new RotateAnimation(90,0);
        //ani3.setRepeatCount(2);
        ani3.setDuration(2000);
        as.addAnimation(ani2);
        as.addAnimation(ani3);
        as.setDuration(2000);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(ad.isRunning())
                  //  ad.stop();
                //else
                  //  ad.start();
                imageView.startAnimation(as);


            }
        });
    }
}
