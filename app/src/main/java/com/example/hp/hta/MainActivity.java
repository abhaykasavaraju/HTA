package com.example.hp.hta;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void postSuggestion(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.hp.hta.Suggestion.class);
        startActivity(intent);
    }
    public void goTo(View view){
        Intent intent = new Intent(MainActivity.this, com.example.hp.hta.Upvote.class);
        startActivity(intent);
    }
    public void postC(View view){
        Intent intent2 = new Intent(MainActivity.this, com.example.hp.hta.sMainActivity.class);
        startActivity(intent2);
    }
    public void trackP(View view){
        Intent intent2 = new Intent(MainActivity.this, com.example.hp.hta.Track.class);
        startActivity(intent2);
    }

}
