package com.rawsun.asus.marathibeginner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mInterstitialAd=new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4175116718779058/1441977751");
        AdRequest request=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mInterstitialAd.loadAd(request);





        //Find the view that shows number category
        final TextView number = (TextView) findViewById(R.id.numbers);

        //set a clicklistener on that view
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {
                    mInterstitialAd.show();
                }
                else{
                    Intent n = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(n);
                    Log.d("TAG","The interstitial was not yet loaded");
                }


                mInterstitialAd.setAdListener(new AdListener(){
                    @Override
                    public void onAdClosed() {
                        Intent n = new Intent(MainActivity.this, NumbersActivity.class);
                        startActivity(n);

                        mInterstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
                    }
                });

            }
        });





        //find the view that show family member catagory
        TextView family = (TextView) findViewById(R.id.family);

        //set onclicklistener on that textview
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {
                    mInterstitialAd.show();
                }
                else{
                    Intent f = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(f);
                    Log.d("TAG","The interstitial was not yet loaded");
                }


                mInterstitialAd.setAdListener(new AdListener(){
                    @Override
                    public void onAdClosed() {
                        Intent f = new Intent(MainActivity.this, FamilyActivity.class);
                        startActivity(f);

                        mInterstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
                    }
                });

            }
        });





        //find the view for color catagory
        TextView color = (TextView) findViewById(R.id.colors);

        //set an onclicklistener
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(c);
            }
        });

        //find view for Phrases catagory
        final TextView phrases = (TextView) findViewById(R.id.phrases);

        //set an onclicklistener on phrases
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(p);
            }
        });





        //find textview for Love category
        final TextView love = (TextView) findViewById(R.id.Love);

        //set an onclicklistener on phrases
        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mInterstitialAd.isLoaded())
                {
                    mInterstitialAd.show();
                }
                else{
                    Intent p = new Intent(MainActivity.this, Romance.class);
                    startActivity(p);
                    Log.d("TAG","The interstitial was not yet loaded");
                }


                mInterstitialAd.setAdListener(new AdListener(){
                    @Override
                    public void onAdClosed() {
                        Intent p = new Intent(MainActivity.this, Romance.class);
                        startActivity(p);

                        mInterstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
                    }
                });


            }
        });





        //find textview for Shopping category
        final TextView shopping = (TextView) findViewById(R.id.shopping);

        //set an onclicklistener on phrases
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MainActivity.this, Shopping.class);
                startActivity(p);
            }
        });


    }
}
