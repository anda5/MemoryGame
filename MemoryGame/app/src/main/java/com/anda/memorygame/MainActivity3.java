package com.anda.memorygame;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity3 extends ActionBarActivity {
    private ImageView imageView,imageViewbtn;
    private int pressed[] ={ 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private int pressed1[] ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private int score=0;
    private int[] p = {R.drawable.i1,
            R.drawable.i2,
            R.drawable.i4,
            R.drawable.i5,
            R.drawable.i6,
            R.drawable.i7,
            R.drawable.i8,
            R.drawable.i9,
            R.drawable.i10,
            R.drawable.i11,
            R.drawable.i12,
            R.drawable.i13,
            R.drawable.i14,
            R.drawable.i15,
            R.drawable.i16,
            R.drawable.i17,
            R.drawable.i18,
            R.drawable.i19,
            R.drawable.i20,
            R.drawable.i21,
            R.drawable.i22,
            R.drawable.i23,
            R.drawable.i24,
            R.drawable.i25,


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
            R.id.imageView19,
            R.id.imageView20,
            R.id.imageView21,
            R.id.imageView22,
            R.id.imageView23,
            R.id.imageView24,
            R.id.imageView25,
            R.id.imageView26,
            R.id.imageView27,
            R.id.imageView28,
            R.id.imageView29,
            R.id.imageView30,
            R.id.imageView31,
            R.id.imageView32,
            R.id.imageView33,
            R.id.imageView34,
            R.id.imageView35,
            R.id.imageView36,
            R.id.imageView37,
            R.id.imageView38,
            R.id.imageView39,
            R.id.imageView40,
            R.id.imageView41,
            R.id.imageView42,
            R.id.imageView43,
            R.id.imageView44,
            R.id.imageView45,
            R.id.imageView46,
            R.id.imageView47,
            R.id.imageView48,
            R.id.imageView49,
            R.id.imageView50,
            R.id.imageView51,
            R.id.imageView52,
            R.id.imageView53,
            R.id.imageView54,
            R.id.imageView55,
            R.id.imageView56,
            R.id.imageView57,
            R.id.imageView58
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);

        changeImage(findImage(imageView, 0),findImage(imageView, 1),0);
        changeImage(findImage(imageView, 2),findImage(imageView, 3),1);
        changeImage(findImage(imageView, 4),findImage(imageView, 5),2);
        changeImage(findImage(imageView, 6),findImage(imageView, 7),3);
        changeImage(findImage(imageView, 9),findImage(imageView, 8),4);
        changeImage(findImage(imageView, 10),findImage(imageView, 11),5);
        changeImage(findImage(imageView, 13),findImage(imageView, 12),6);
        changeImage(findImage(imageView, 14),findImage(imageView, 15),7);
        changeImage(findImage(imageView, 16),findImage(imageView, 18),8);
        changeImage(findImage(imageView, 19),findImage(imageView, 17),9);
        changeImage(findImage(imageView, 20),findImage(imageView, 22),10);
        changeImage(findImage(imageView, 23),findImage(imageView, 21),11);
        changeImage(findImage(imageView, 26),findImage(imageView, 28),12);
        changeImage(findImage(imageView, 24),findImage(imageView, 25),13);
        changeImage(findImage(imageView, 27),findImage(imageView, 29),14);
        changeImage(findImage(imageView, 30),findImage(imageView, 32),4);
        changeImage(findImage(imageView, 33),findImage(imageView, 31),5);
        changeImage(findImage(imageView, 35),findImage(imageView, 36),6);
        changeImage(findImage(imageView, 37),findImage(imageView, 34),7);
        changeImage(findImage(imageView, 38),findImage(imageView, 39),8);
        changeImage(findImage(imageView, 41),findImage(imageView, 42),9);
        changeImage(findImage(imageView, 40),findImage(imageView, 43),10);
        changeImage(findImage(imageView, 44),findImage(imageView, 46),11);
        changeImage(findImage(imageView, 47),findImage(imageView, 45),12);


        setTimer();
        imageViewbtn=(ImageView)findViewById(R.id.imageView13);
        imageViewbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),FirstActivity.class);
                startActivity(i);
            }
        });




    }
    public void setTimer() {
        final TextView _tv = (TextView) findViewById( R.id.textView5 );
        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
                _tv.setText(new SimpleDateFormat("mm:ss").format(new Date( millisUntilFinished)));
                if(score==15) {
                    _tv.setText("you win!");

                }
            }

            public void onFinish() {
                score+=2;
                if(score!= 24){
                    _tv.setText("you lost!");

                }
            }
        }.start();

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
                            firstImage.setImageResource(R.drawable.bufnitoi);
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
                            lastImage.setImageResource(R.drawable.bufnitoi);
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
        getMenuInflater().inflate(R.menu.menu_main_activity3, menu);
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
