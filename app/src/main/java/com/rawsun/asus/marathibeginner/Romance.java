package com.rawsun.asus.marathibeginner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Romance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of words
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word ("I like her","Malaa ti aavadate"));
        words.add(new Word ("See you later","Punhaa bhetu"));
        words.add(new Word ("You are very nice","Tu khoop chhangli aahes."));
        words.add(new Word ("Please call me","Krupayaa malaa call karaa."));
        words.add(new Word ("I dont think so.","Malaa naahi tasa waatat"));
        words.add(new Word ("I am going to a party","Mi party la jaat aahe"));
        words.add(new Word ("What did you do last night?","Tumhi kaal raatri kaay kelat?"));
        words.add(new Word ("Do you want to come with me?","Tumhaalaa maazyaa sobat yaayache aahe kaa?"));
        words.add(new Word ("Lets go for a walk","Chalaa thoda firun yeu"));
        words.add(new Word ("What should i wear?","Mi konate kapade ghaalu?"));
        words.add(new Word ("What do you want to do?","Kaay karaayachi ichchha aahe tumachi?"));
        words.add(new Word ("You are beautiful","Tu sundar ahes"));
        words.add(new Word ("You are handsome.","Tu rajbinda ahes."));
        words.add(new Word ("I like you","Tumhi malaa aavadataa"));
        words.add(new Word ("You have a wonderful smile","Aaple haasya farach sundar aahe"));
        words.add(new Word ("Let's go for a movie","Aapan pictre la javuya"));
        words.add(new Word ("Can i have your number?","Mala tumcha number milel kaa?"));
        words.add(new Word ("I love you","Majhe tujhyawar prem aahe."));
        words.add(new Word ("Let's dance.","Aapan naachu yaa"));
        words.add(new Word ("How are you feeling?","Tumhaalaa kasa waatatay?"));
        words.add(new Word ("Are you feeling better?","Tumhaalaa bara waatatay kaa?"));
        words.add(new Word ("I am feeling happy.","Malaa aanandi waatatay."));
        words.add(new Word ("i am busy","Mi kaamaat aahe."));
        words.add(new Word ("Why are you so tensed?","Tumhi yevadhe chintaagrast kaa distaa?"));
        words.add(new Word ("I am not yet ready","Mi ajun tayaar naahi."));
        words.add(new Word ("He is very annoying","Tey faarach traasadaayak aahet."));
        words.add(new Word ("That's not right","Barobar naahi tey"));
        words.add(new Word ("keep trying","Prayatn karat rahaa"));



        WordAdapter itemAdapter=new WordAdapter(this,words,R.color.category_love);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(itemAdapter);



    }}
