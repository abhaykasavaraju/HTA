package com.example.hp.hta;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Suggestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
    }
    public void displayMessage(View view)
    {
        Snackbar mySnackbar=Snackbar.make(findViewById(R.id.submit_button),"Suggestion posted. Suggestion ID: BD1A50T ",
                Snackbar.LENGTH_LONG);
        mySnackbar.show();
    }

}