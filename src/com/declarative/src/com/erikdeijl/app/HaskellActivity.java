package com.erikdeijl.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by erikdeijl on 05/10/15.
 */
public class HaskellActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        helloWorld();
    }

    public native void helloWorld();
    static { System.loadLibrary("haskell");}
}
