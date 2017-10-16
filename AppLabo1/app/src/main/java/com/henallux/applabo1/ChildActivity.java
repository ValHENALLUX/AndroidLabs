package com.henallux.applabo1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChildActivity extends AppCompatActivity
{
    private Button clickMeBtn;
    private Button phoneBtn, linkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Bundle bundle = this.getIntent().getExtras();
        final String messageFromParent = bundle.getString("infoId");

        Toast.makeText(ChildActivity.this, messageFromParent, Toast.LENGTH_SHORT).show();

        clickMeBtn = (Button) findViewById(R.id.btnHome);
        clickMeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                setResult(1);
                finish();
            }
        });

        phoneBtn = (Button) findViewById(R.id.phoneBtn);
        phoneBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                android.net.Uri uri = Uri.parse("tel:0494477358");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        linkBtn = (Button) findViewById(R.id.linkBtn);
        linkBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                android.net.Uri uri = Uri.parse("http://www.google.com/#q=henallux");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
