package com.example.rinal.scroll;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class scroll extends AppCompatActivity {


    public Button click_btn;

    public void nextActivity(){
        click_btn = (Button)findViewById(R.id.click_btn);
        click_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toy = new Intent(scroll.this, click_game.class);

                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        nextActivity();

    }
}
