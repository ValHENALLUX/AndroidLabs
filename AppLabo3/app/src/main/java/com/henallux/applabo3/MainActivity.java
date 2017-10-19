package com.henallux.applabo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.action_settings)
        { return true;}

        switch(item.getItemId())
        {
            case R.id.itemCallId :
            {
                Toast.makeText(getBaseContext(), "make a phone call", Toast.LENGTH_LONG).show();
            }
            case R.id.itemEmailId :
            {
                Toast.makeText(getBaseContext(), "create a new mail", Toast.LENGTH_LONG).show();
            }
            case R.id.itemSearchId :
            {
                Toast.makeText(getBaseContext(), "search the web", Toast.LENGTH_LONG).show();
            }
        }
        return true;
    }
}
