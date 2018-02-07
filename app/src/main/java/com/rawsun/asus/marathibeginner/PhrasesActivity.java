package com.rawsun.asus.marathibeginner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of words
        ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word("I am coming right now.","Mi aata lagech yetoy"));
        words.add(new Word("I will be right back.","Mi lawakarach parat yein."));
        words.add(new Word("Where were you?","Kuthe hotaa tumhi?"));
        words.add(new Word("Can you hold this for me?","Hey jaraa pakadnaar kaa?"));
        words.add(new Word("Do you need anything?","Tumhaalaa kaahi hawe aahe kaa?"));
        words.add(new Word("I remember.","Maazyaa lakshaat aahe"));
        words.add(new Word("How old are you?","Tumache way kaay aahe?"));
        words.add(new Word("What's your height?","Tumachi unchi kiti aahe?"));
        words.add(new Word("How do you know?","Tumhaalaa kase maahit?"));
        words.add(new Word("It's very important.","Hey khoop mahattwaache aahe."));
        words.add(new Word("Why are you laughing?","Tumhi kaa hasat aahaat?"));
        words.add(new Word("Why did you do that?","Tumhi tasa kaa kelat?"));
        words.add(new Word("what's the matter?","kaay zaal?"));
        words.add(new Word("What does he want from you?","Tyala tumchya kadun kay have aahe?"));
        words.add(new Word("The phone is ringing","Phone waajat aahe"));
        words.add(new Word("Who is it?","kon bolatay?"));
        words.add(new Word("This is Raman speaking","Mi Raman bolatoy"));
        words.add(new Word("i would like to speak to Raman","Malaa Raman shi bolaayacha hota"));
        words.add(new Word("He is not home","Tey ghari naahit"));
        words.add(new Word("I cant hear you","Malaa tumache bolane aiku yet nahiye"));
        words.add(new Word("Can you speak louder please?","Jaraa mothyaane bolaal kaa?"));
        words.add(new Word("I will call back later.","Mi nantar call karen."));
        words.add(new Word("What do you think?","Tulaa kaay waatata?"));
        words.add(new Word("Let me think about it.","Malaa yaabaddal vichaar karu det."));
        words.add(new Word("It is a good idea","Chhaan aahe hi kalpana."));
        words.add(new Word("I am not sure","Malaa khaatri nahi."));
        words.add(new Word("Let's go have a look","Chalaa baghun yeu."));

        WordAdapter itemAdapter=new WordAdapter(this,words,R.color.category_phrases);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(itemAdapter);



    }
}
