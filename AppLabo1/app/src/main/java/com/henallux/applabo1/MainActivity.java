package com.henallux.applabo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clickMeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("onCreateTag", "onCreate is executed");

        clickMeBtn = (Button) findViewById(R.id.btnGo);
        clickMeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                Toast.makeText(MainActivity.this, "Welcome to our wonderful world", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
