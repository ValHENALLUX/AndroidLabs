package com.henallux.applabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clickMeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickMeBtn = (Button) findViewById(R.id.childBtn);
        clickMeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                //Toast.makeText(MainActivity.this, "Welcome to our wonderful world", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ChildActivity.class);
                intent.putExtra("infoId", "Message sent by the parent");
                startActivityForResult(intent, 1);
            }
        });

        Log.i("lifeCycle", "MainActivity.onCreate is executed");
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
                break;
            }
            case R.id.itemEmailId :
            {
                Toast.makeText(getBaseContext(), "create a new mail", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.itemSearchId :
            {
                Toast.makeText(getBaseContext(), "search the web", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.itemChildId :
            {
                Intent intent = new Intent(MainActivity.this, ChildActivity.class);
                intent.putExtra("infoId", "Message sent by the parent");
                startActivityForResult(intent, 1);
            }
        }
        return true;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 1)
        {
            switch (resultCode)
            {
                case 0 : Toast.makeText(MainActivity.this, "Result code = 0", Toast.LENGTH_LONG).show();
                    break;
                case 1 : Toast.makeText(MainActivity.this, "Result code = 1", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
