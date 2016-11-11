package com.example.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    // Code for Step Two - adding an Android Library to display the joke

    public static final String IPCJokeKey = "JokeText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        Intent receivedIntent = getIntent();
        String receivedJoke = receivedIntent.getStringExtra(IPCJokeKey);
        TextView jokeTextView = (TextView)findViewById(R.id.jokeDisplayTextView);

        if(receivedJoke != null){
            jokeTextView.setText(receivedJoke);
        } else {
            jokeTextView.setText("No Joke Received :(");  //TODO Move to Strings file
        }
    }
}
