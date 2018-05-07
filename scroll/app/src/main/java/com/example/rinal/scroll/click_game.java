package com.example.rinal.scroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class click_game extends AppCompatActivity {

    private TextView mShowCount;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }



    public void showToast(View view) {
             Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
             toast.show();

    }

         public void countUp(View view) {
             mCount++;
            if (mShowCount != null)
                mShowCount.setText(Integer.toString(mCount));
         }
}
