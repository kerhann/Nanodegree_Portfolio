package com.example.julot.nanodegreeportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.buttonSpotify);
        Button b2 = (Button) findViewById(R.id.buttonScores);
        Button b3 = (Button) findViewById(R.id.buttonLibrary);
        Button b4 = (Button) findViewById(R.id.buttonBigger);
        Button b5 = (Button) findViewById(R.id.buttonReader);
        Button b6 = (Button) findViewById(R.id.buttonCapstone);
        b1.setOnClickListener(buttonhandler1);
        b2.setOnClickListener(buttonhandler2);
        b3.setOnClickListener(buttonhandler3);
        b4.setOnClickListener(buttonhandler4);
        b5.setOnClickListener(buttonhandler5);
        b6.setOnClickListener(buttonhandler6);

    }
    View.OnClickListener buttonhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            Context context = getApplicationContext();
            CharSequence text = "This will launch my Spotify Streamer app";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    };
    View.OnClickListener buttonhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
            Context context = getApplicationContext();
            CharSequence text = "This will launch my Scores app";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    };
    View.OnClickListener buttonhandler3 = new View.OnClickListener() {
        public void onClick(View v) {
            Context context = getApplicationContext();
            CharSequence text = "Guess what, this will launch my Library app";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    };
    View.OnClickListener buttonhandler4 = new View.OnClickListener() {
        public void onClick(View v) {
            Context context = getApplicationContext();
            CharSequence text = "This you click, Bigger you launch";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();        }
    };
    View.OnClickListener buttonhandler5 = new View.OnClickListener() {
        public void onClick(View v) {
            Context context = getApplicationContext();
            CharSequence text = "AMAAAZIIIING, this will launch my XYZ Reader app";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();        }
    };
    View.OnClickListener buttonhandler6 = new View.OnClickListener() {
        public void onClick(View v) {
            Context context = getApplicationContext();
            CharSequence text = "Are you kidding me? You don't know what this button will do???";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    };


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
}
