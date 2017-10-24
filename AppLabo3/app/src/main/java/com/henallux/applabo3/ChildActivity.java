package com.henallux.applabo3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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


    }

}
