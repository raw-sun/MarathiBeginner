package com.rawsun.asus.marathibeginner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of words
        ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word ("One","ek",R.drawable.number_one));
        words.add(new Word("Two","don",R.drawable.number_two));
        words.add(new Word("three","tin",R.drawable.number_three));
        words.add(new Word("four","char",R.drawable.number_four));
        words.add(new Word("five","pach",R.drawable.number_five));
        words.add(new Word("six","saha",R.drawable.number_six));
        words.add(new Word("seven","sat",R.drawable.number_seven));
        words.add(new Word("eight","aath",R.drawable.number_eight));
        words.add(new Word("nine","nau",R.drawable.number_nine));
        words.add(new Word("Ten","daha",R.drawable.number_ten));

        WordAdapter itemAdapter=new WordAdapter(this,words,R.color.category_numbers);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(itemAdapter);
    }
}
