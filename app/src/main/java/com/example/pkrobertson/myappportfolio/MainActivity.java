package com.example.pkrobertson.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast toast;
            toast = Toast.makeText(getApplicationContext(), "Under construction...", Toast.LENGTH_SHORT);
            toast.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the Spotify App button */
    public void launchSpotifyApp (View view) {
        Toast toast;

        toast = Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when the user clicks the Scores App button */
    public void launchScoresApp (View view) {
        Toast toast;

        toast = Toast.makeText(getApplicationContext(), "This button will launch my Scores App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when the user clicks the Library App button */
    public void launchLibraryApp (View view) {
        Toast toast;

        toast = Toast.makeText(getApplicationContext(), "This button will launch my Library App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when the user clicks the Build it Bigger App button */
    public void launchBuildApp (View view) {
        Toast toast;

        toast = Toast.makeText(getApplicationContext(), "This button will launch my Build it Bigger App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when the user clicks the XYZ Reader App button */
    public void launchReaderApp (View view) {
        Toast toast;

        toast = Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader App!", Toast.LENGTH_SHORT);
        toast.show();
    }
    /** Called when the user clicks the Capstone App button */
    public void launchCapstoneApp (View view) {
        Toast toast;

        toast = Toast.makeText(getApplicationContext(), "This button will launch my Capstone App!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
