package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

import java.util.concurrent.TimeUnit;


public class ApplicationTest extends AndroidTestCase {

    public void testJokeAsync(){

        // Test to check that the Async Task doesn't return an empty String.
        // Times Out after 10s (fine for local instance, possibly increase in live environment.

        try {
            EndpointsAsyncTask testAsyncTask = new EndpointsAsyncTask();
            testAsyncTask.execute(new Pair<Context, String>(getContext(), "testing"));
            String testJoke = testAsyncTask.get(10, TimeUnit.SECONDS);
            assertFalse(testJoke.isEmpty());
        } catch (Exception e){
            fail("Test timed out in 10s");
        }
    }


}