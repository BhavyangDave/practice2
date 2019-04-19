package com.example.hp.practice1;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = ;
    private EditText e1,e2;
    private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

                //requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
                //getSupportActionBar().hide(); // hide the title bar
                //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                //WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        add();
    }
    public void add() {
        e1 = (EditText) findViewById(R.id.editText2);
        e2 = (EditText) findViewById(R.id.editText3);

        b1 = (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = e1.getText().toString();
                String v2 = e2.getText().toString();
                int a = Integer.parseInt(v1);
                int b = Integer.parseInt(v2);
                int sum = a + b;

                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }
}
