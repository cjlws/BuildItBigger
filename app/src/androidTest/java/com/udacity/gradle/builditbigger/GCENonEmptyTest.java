package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * Created by johnrobinson on 11/11/2016.
 */

public class GCENonEmptyTest extends AndroidTestCase {

    public void test(){
//        assertEquals("banana","bana");
        String banana = "banaan";
        assertNotNull(banana);
    }
}
