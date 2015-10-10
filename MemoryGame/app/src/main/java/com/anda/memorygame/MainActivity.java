package com.anda.memorygame;


import android.graphics.drawable.AnimationDrawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends ActionBarActivity {

     private ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeImage(findImage(imageView, 0), 1);
        changeImage(findImage(imageView, 1), 2);
        changeImage(findImage(imageView, 2), 3);
        changeImage(findImage(imageView, 3), 4);
        changeImage(findImage(imageView, 4), 5);
        changeImage(findImage(imageView, 5), 6);
        changeImage(findImage(imageView, 6), 7);
        changeImage(findImage(imageView, 7), 8);
        changeImage(findImage(imageView, 8), 1);
        changeImage(findImage(imageView, 9), 2);
        changeImage(findImage(imageView, 10), 3);
        changeImage(findImage(imageView, 11), 4);
        changeImage(findImage(imageView, 12), 5);
        changeImage(findImage(imageView, 13), 6);
        changeImage(findImage(imageView, 14), 7);
        changeImage(findImage(imageView, 15), 8);

    }
     int[] p = {R.drawable.img,
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
                R.drawable.img4,
                R.drawable.img5,
                R.drawable.img6,
                R.drawable.img7,
                R.drawable.img8};

    int[] image = {R.id.imageView,
                   R.id.imageView2,
                   R.id.imageView3,
                   R.id.imageView4,
                   R.id.imageView5,
                   R.id.imageView6,
                   R.id.imageView7,
                   R.id.imageView16,
                   R.id.imageView9,
                   R.id.imageView12,
                   R.id.imageView10,
                   R.id.imageView14,
                   R.id.imageView15,
                   R.id.imageView11,
                   R.id.imageView17,
                   R.id.imageView18,
                      };
    private ImageView findImage(ImageView img,int number){

       img = (ImageView)this.findViewById(image[number]);
       return img;
    }
    private void changeImage(final ImageView currentImage, final int number ) {

             currentImage.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     currentImage.setImageResource(p[number]);
                     new CountDownTimer(3000, 1000) { // 5000 = 5 sec

                         public void onTick(long millisUntilFinished) {
                         }

                         public void onFinish() {
                          currentImage.setImageResource(R.drawable.photo);
                         }
                     }.start();

                 }
             });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    }






















