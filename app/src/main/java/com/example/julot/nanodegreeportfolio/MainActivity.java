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
    }

    private void showToastMessage(String msg){
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void spotifyClick(View v) {
        showToastMessage(this.getResources().getString(R.string.toast_spotify));
    }
    public void scoresClick(View v) {
        showToastMessage(this.getResources().getString(R.string.toast_scores));
    }
    public void libraryClick(View v) {
        showToastMessage(this.getResources().getString(R.string.toast_library));
    }
    public void biggerClick(View v) {
        showToastMessage(this.getResources().getString(R.string.toast_bigger));
    }
    public void readerClick(View v) {
        showToastMessage(this.getResources().getString(R.string.toast_reader));
    }
    public void capstoneClick(View v) {
        showToastMessage(this.getResources().getString(R.string.toast_capstone));
    }


}
