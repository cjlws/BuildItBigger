package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.JavaJoke;
import com.example.androidjokelibrary.JokeDisplayActivity;


public class MainActivity extends ActionBarActivity {

    //TODO Remove Menu if not used by the end

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
