package com.example.hp.hta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Upvote extends AppCompatActivity {

    int c=0;
    int p=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upvote);
    }
    public void upVote(View view)
    {
        c++;
        Button radioButton = (Button) findViewById(R.id.Button1);
        radioButton.setText(Integer.toString(c));
    }
    public void downVote(View view)
    {
        p++;
        Button radioButton = (Button) findViewById(R.id.Button2);
        radioButton.setText(Integer.toString(p));
    }
}
