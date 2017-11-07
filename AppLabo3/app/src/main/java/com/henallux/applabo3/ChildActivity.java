package com.henallux.applabo3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Bundle bundle = this.getIntent().getExtras();
        final String messageFromParent = bundle.getString("infoId");

        Toast.makeText(ChildActivity.this, messageFromParent, Toast.LENGTH_SHORT).show();
        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                setResult(1);
                finish();
            }
        });*/

        Log.i("lifeCycle", "ChildActivity.onCreate is executed");
    }

    protected void onStart(Bundle savedInstanceState)
    {
        Log.i("lifeCycle", "ChildActivity.onStart is executed");
    }
    protected void onResume(Bundle savedInstanceState)
    {
        Log.i("lifeCycle", "ChildActivity.onResume is executed");
    }

    protected void onPause(Bundle savedInstanceState)
    {
        Log.i("lifeCycle", "ChildActivity.onPause is executed");
    }
    protected void onStop(Bundle savedInstanceState)
    {
        Log.i("lifeCycle", "ChildActivity.onStop is executed");
    }
    protected void onRestart(Bundle savedInstanceState)
    {
        Log.i("lifeCycle", "ChildActivity.onRestart is executed");
    }
    protected void onDestroy(Bundle savedInstanceState)
    {
        Log.i("lifeCycle", "ChildActivity.onDestroy is executed");
    }

}
