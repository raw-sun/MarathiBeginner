package com.rawsun.asus.marathibeginner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;



import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of words
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word ("father","baba",R.drawable.family_father));
        words.add(new Word("mother","Ai",R.drawable.family_mother));
        words.add(new Word("son","Mulga",R.drawable.family_son));
        words.add(new Word("daughter","Mulgi",R.drawable.family_daughter));
        words.add(new Word("brother","Bhau",R.drawable.family_younger_brother));
        words.add(new Word("sister","Bahin",R.drawable.family_younger_sister));
        words.add(new Word("grandmother","Aji",R.drawable.family_grandmother));
        words.add(new Word("grandfather","Ajoba",R.drawable.family_grandfather));
        words.add(new Word("Brother of your husband","Dir",R.drawable.family_older_brother));
        words.add(new Word("Sister of your husband","Nanand",R.drawable.family_older_sister));
        words.add(new Word("Brother of your wife","Mevhna",R.drawable.family_father));
        words.add(new Word("Sister of your wife","Mevhni",R.drawable.family_younger_sister));

        WordAdapter itemAdapter=new WordAdapter(this,words,R.color.category_family);

        ListView listView=(ListView)findViewById(R.id.list);


        listView.setAdapter(itemAdapter);
    }
}











