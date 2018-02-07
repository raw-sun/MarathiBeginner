package com.rawsun.asus.marathibeginner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of words
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word ("Red","Lal",R.drawable.color_red));
        words.add(new Word("Yellow","Pivala",R.drawable.color_mustard_yellow));
        words.add(new Word("Green","Hirva",R.drawable.color_green));
        words.add(new Word("Brown","Bhura",R.drawable.color_brown));
        words.add(new Word("Black","kala",R.drawable.color_black));
        words.add(new Word("White","Pamdhara",R.drawable.color_white));
        words.add(new Word("Grey","Karada",R.drawable.color_gray));
        words.add(new Word("Gold","Soneri",R.drawable.color_dusty_yellow));
        words.add(new Word("Silver","Chamderi",R.drawable.color_gray));

        WordAdapter itemAdapter=new WordAdapter(this,words,R.color.category_colors);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(itemAdapter);



    }
}
