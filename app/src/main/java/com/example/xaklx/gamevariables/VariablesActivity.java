package com.example.xaklx.gamevariables;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class VariablesActivity extends Activity {

    // This is the entry point to our game
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Our Java code will start here

        // Let's declare and initialise a whole bunch of variables in one step
        int playerScore = 0;
        String playerName = "Alan Turing";
        float valuePi = 3.141f;
        boolean isAlive = true;

        // Our next block of code will go here
        Log.d("playerScore is", "" + playerScore);
        Log.d("playerName is", "" + playerName);
        Log.d("valuePi is", "" + valuePi);
        Log.d("isAlive is", "" + isAlive);

        playerScore ++;
// Just incremented player score by 1

        playerName = playerName + " was quite good with numbers.";
        /*

        Yep we can add strings as well
        It is called concatenation
hice un cambio
        */

        valuePi = valuePi + 10;
// valuePi is now 13.141.

        valuePi = valuePi + playerScore;
// Now valuePi is now 13.141 + 1

        isAlive = false;
// Uhh, now I'm dead

        Log.d("playerScore is", "" + playerScore);
        Log.d("playerName is", "" + playerName);
        Log.d("valuePi is", "" + valuePi);
        Log.d("isAlive is", "" + isAlive);
        // !!Our code must end here - for now.
    }
}
