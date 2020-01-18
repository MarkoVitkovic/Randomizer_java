package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import java.util.Random;
import android.view.View;
import android.os.Bundle;
import java.lang.*;
import java.io.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    int text, random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         button = findViewById(R.id.button);
         textView = findViewById(R.id.textViewResult);
         editText = findViewById(R.id.editTexts);


             button.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     Random rand = new Random();
                     text = Integer.parseInt(editText.getText().toString());
                     random = rand.nextInt(text) + 1;
                     textView.setText("" + random);
                 }

             });


}
}
