package com.kimhyojung.android.materialdesign_propertyanimation_spreadcube;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    float x=0;
    float y=0;

    Button spreadButton;

    ImageButton imagebutton1;
    ImageButton imagebutton2;
    ImageButton imagebutton3;
    ImageButton imagebutton4;
    ImageButton imagebutton5;
    ImageButton imagebutton6;
    ImageButton imagebutton7;
    ImageButton imagebutton8;
    ImageButton imagebutton9;
    int flag=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spreadButton = (Button)findViewById(R.id.spreadbutton);

        imagebutton2 = (ImageButton)findViewById(R.id.imageButton2);
        imagebutton1 = (ImageButton)findViewById(R.id.imageButton1);
        imagebutton3 = (ImageButton)findViewById(R.id.imageButton3);
        imagebutton4 = (ImageButton)findViewById(R.id.imageButton4);
        imagebutton5 = (ImageButton)findViewById(R.id.imageButton5);
        imagebutton6 = (ImageButton)findViewById(R.id.imageButton6);
        imagebutton7 = (ImageButton)findViewById(R.id.imageButton7);
        imagebutton8 = (ImageButton)findViewById(R.id.imageButton8);
        imagebutton9 = (ImageButton)findViewById(R.id.imageButton9);
    }

    public void spread(View v){
        if(flag==1){
            spreadButton.setText("COMBINE");
             move(imagebutton1, -imagebutton1.getWidth(), -imagebutton1.getHeight());
             move(imagebutton2, imagebutton2.getWidth()*0, -imagebutton2.getHeight());
             move(imagebutton3, imagebutton3.getWidth(), -imagebutton3.getHeight());
             move(imagebutton4, -imagebutton4.getWidth(), imagebutton4.getHeight()*0);
             move(imagebutton5, imagebutton5.getWidth()*0, imagebutton5.getHeight()*0);
             move(imagebutton6, imagebutton6.getWidth(), imagebutton6.getHeight()*0);
             move(imagebutton7, -imagebutton7.getWidth(), imagebutton7.getHeight());
             move(imagebutton8, imagebutton8.getWidth()*0, imagebutton8.getHeight());
             move(imagebutton9, imagebutton9.getWidth(), imagebutton9.getHeight());
            flag=0;
        }else{
            spreadButton.setText("SPREAD");
            combine(imagebutton1,0,0);
            combine(imagebutton2,0,0);
            combine(imagebutton3,0,0);
            combine(imagebutton4,0,0);
            combine(imagebutton5,0,0);
            combine(imagebutton6,0,0);
            combine(imagebutton7,0,0);
            combine(imagebutton8,0,0);
            combine(imagebutton9,0,0);
            flag=1;
        }

    }

    public void move(View player, int distancex, int distancey){
        ObjectAnimator ani1 = ObjectAnimator.ofFloat(player,"translationX", distancex);
        ObjectAnimator ani2 = ObjectAnimator.ofFloat(player,"translationY", distancey);

        AnimatorSet aniset = new AnimatorSet();
        aniset.setDuration(2000);
        aniset.playTogether(ani1, ani2);
        aniset.start();
    }

    public void combine(View player, int distancex, int distancey){
        move(imagebutton1, 0, 0);
        move(imagebutton2, 0, 0);
        move(imagebutton3, 0, 0);
        move(imagebutton4,0, 0);
        move(imagebutton5,0, 0);
        move(imagebutton6,0, 0);
        move(imagebutton7,0, 0);
        move(imagebutton8,0, 0);
        move(imagebutton9,0, 0);
    }

}
