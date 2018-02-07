package com.rawsun.asus.marathibeginner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of words
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word ("How much is this for ?","Hyachi kimmat kay aahe ?"));
        words.add(new Word ("This is too expensive.","He farach mahag aaghe"));
        words.add(new Word ("What is the final price for this?","Hyachi shevatchi kimmat kay aahe?"));
        words.add(new Word ("I wish i had one.","Maazyaakadehi ek asata tar."));
        words.add(new Word ("He like it very much.","Tyaanna hey khoop aavadata."));
        words.add(new Word ("I don't want it.","Malaa hey nakoy."));
        words.add(new Word ("I'll take that one also.","Mi tey suddhaa ghein."));
        words.add(new Word ("Which one do you like. ","Tumhaalaa konate aavadale?"));
        words.add(new Word ("I still haven't decided.","Mi ajun tharavale naahi."));
        words.add(new Word ("Do you have anything cheaper?","Tumachyaakade swastaatale kaahi aahe kaa?"));
        words.add(new Word ("How are you paying?","Tumhi paise kase bharanaar aahaaat?"));
        words.add(new Word ("We only accept cash.","Aamhi fakt rokh sweekaarato."));
        words.add(new Word ("Which one is better?","Konte jaast changle aahe?"));
        words.add(new Word ("I don't have enough money.","Maazyaajawal purese paise nahit."));
        words.add(new Word ("Can i borrow some money?","Malaa thode paise udhaar milatil kaa?"));
        words.add(new Word ("Which one is the best?","Sagalyaat chaangle konate aahe?"));
        words.add(new Word ("What are you looking for?","Tumhi kaay shodhat aahaat?"));
        words.add(new Word ("I will buy this.","Mi hey kharedi karen"));
        words.add(new Word ("i would like to return this ","Malaa hey parat karaayache aahe"));
        words.add(new Word ("I don't have any money","Maazyaajawal kaahich paise naahit"));



        WordAdapter itemAdapter=new WordAdapter(this,words,R.color.category_shopping);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(itemAdapter);



    }}

