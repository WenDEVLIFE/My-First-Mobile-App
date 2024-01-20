package com.example.myfirstapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This is how to set the content view programmatically
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);

        // This is how to set the background color of a button programmatically
        int red =  ContextCompat.getColor(this,R.color.darker_red);
        button.setBackgroundColor(red);


        button.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button

            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle("Alert Message");
            alertDialog.setMessage("Hello World");
            alertDialog.show();


        });
    }
}