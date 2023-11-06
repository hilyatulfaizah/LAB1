package com.example.lab1_hilyatul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;

    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton  = (Button) findViewById(R.id.button);
    }

    public void displayText(View view){
        
        tvMessage.setText("Welcome!" + counter++);

        Toast toast = Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void testfunction(View view){
}