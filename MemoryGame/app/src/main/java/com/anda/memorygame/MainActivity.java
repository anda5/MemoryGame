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
import android.widget.TextView;


import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends ActionBarActivity {

     private ImageView imageView,img1,img2,img3,img4;
     private int pressed[] ={ 0,0,0,0,0,0,0,0,0};
     private int pressed1[] ={0,0,0,0,0,0,0,0,0};
     private int score=0;
     private int[] p = {R.drawable.img8,
                        R.drawable.img1,
                        R.drawable.img2,
                        R.drawable.img3,
                        R.drawable.img4,
                        R.drawable.img5,
                        R.drawable.img6,
                        R.drawable.img7,

                        };
     private int[] image = {R.id.imageView,
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         img1 = findImage(imageView,0);
         img2 = findImage(imageView,1);
         img3 = findImage(imageView,2);
         img4 = findImage(imageView,3);


        changeImage(findImage(imageView, 0),findImage(imageView, 1),0);
        changeImage(findImage(imageView, 2),findImage(imageView, 3),1);
        changeImage(findImage(imageView, 4),findImage(imageView, 5),2);
        changeImage(findImage(imageView, 6),findImage(imageView, 7),3);
        changeImage(findImage(imageView, 9),findImage(imageView, 8),4);
        changeImage(findImage(imageView, 10),findImage(imageView, 11),5);
        changeImage(findImage(imageView, 13),findImage(imageView, 12),6);
        changeImage(findImage(imageView, 14),findImage(imageView, 15),7);




    }




    private ImageView findImage(ImageView img,int number){

       img = (ImageView)this.findViewById(image[number]);
       return img;
    }

    private void changeImage(final ImageView firstImage,final ImageView lastImage, final int number) {

        firstImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                pressed[number] = 1;
                firstImage.setImageResource(p[number]);

                new CountDownTimer(1000, 1000) { // 5000 = 5 sec

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        if (pressed1[number] == 1) {
                            firstImage.setImageResource(p[number]);
                            pressed[number] = 1;

                                score++;
                                TextView scoreTextView = (TextView)findViewById(R.id.textView4);
                                scoreTextView.setText(String.valueOf(score));

                        } else {
                            firstImage.setImageResource(R.drawable.photo);
                            pressed[number] = 0;
                        }

                    }
                }.start();
            }
        });

        lastImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                pressed1[number]=1;
                lastImage.setImageResource(p[number]);

                new CountDownTimer(1000, 1000) { // 5000 = 5 sec

                    public void onTick(long millisUntilFinished) {
                    }

                    public void onFinish() {
                        if(pressed[number] == 1){
                            lastImage.setImageResource(p[number]);
                            pressed1[number] = 1;
                        }

                        else {
                            lastImage.setImageResource(R.drawable.photo);
                            pressed1[number] = 0;
                        }

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






















