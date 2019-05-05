package com.example.ersteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button changeButton;
    private TextView helloText;
    private boolean isChanged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeButton = (Button) findViewById(R.id.changeButton);
        helloText = (TextView) findViewById(R.id.helloTextView);

        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!isChanged) {
                    helloText.setText("Hallo Welt!");
                    isChanged = true;
                } else {
                    helloText.setText("Hello World!");
                    isChanged = false;
                }
            }
        });
    }
}
