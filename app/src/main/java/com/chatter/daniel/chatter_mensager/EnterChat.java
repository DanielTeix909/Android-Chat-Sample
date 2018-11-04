package com.chatter.daniel.chatter_mensager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EnterChat extends AppCompatActivity {
    private Button entarchat;
    private TextView backmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_chat);

        entarchat = (Button) findViewById(R.id.chatenter);
        backmenu = (TextView) findViewById(R.id.enterchattxtview);


        entarchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnterChat.this, Chat_Activity.class));
            }
        });


        backmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnterChat.this, MainActivity.class));
            }
        });
    }
}
