package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an list of words
        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        int index = 0;

        TextView wordView = new TextView(this);
        wordView.setText(words.get(index));
        rootView.addView(wordView);

        index = index + 1;

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(index));
        rootView.addView(wordView2);

        index = index + 1;

        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(index));
        rootView.addView(wordView3);

    }
}
