package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Pair;
import android.view.View;

import com.example.JavaJoke;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void tellJoke(View view) {

        // Code required for Step One of the task
//        JavaJoke javaJoke = new JavaJoke();
//        Toast.makeText(this, javaJoke.tellAJoke(), Toast.LENGTH_SHORT).show();

        // Code for Step Two of Tesk
//        Intent openJokeDisplay = new Intent(this, JokeDisplayActivity.class);
//        openJokeDisplay.putExtra(JokeDisplayActivity.IPCJokeKey,javaJoke.tellAJoke());
//        startActivity(openJokeDisplay);


        // Code for Step Three of Task
        JavaJoke javaJoke = new JavaJoke();
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, javaJoke.tellAJoke()));
    }

}
