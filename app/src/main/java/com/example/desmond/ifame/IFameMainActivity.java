package com.example.desmond.ifame;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import fragments.NavigationDrawerFragment;


public class IFameMainActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifame_main);
        toolbar = (Toolbar) findViewById(R.id.ifame_main_toolbar);
        setSupportActionBar(toolbar);
        /*
            Setup navigation drawer
         */
        NavigationDrawerFragment navigationDrawerFragment =
                (NavigationDrawerFragment) getFragmentManager().findFragmentById(R.id.nav_drawer_fragment);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.ifame_drawerLayout);
        //the drawer layout and toolbar have to be pass to the Actionbardrawertoggle in other to perform drawer-open and close actions
        navigationDrawerFragment.setup(mDrawerLayout, toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ifame_main, menu);
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
            Toast.makeText(this, "this is working", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
