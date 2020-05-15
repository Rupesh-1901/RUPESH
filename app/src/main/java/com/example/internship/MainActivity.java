package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.internship.R.layout.activity_main;
import static com.example.internship.R.string.name;

public class MainActivity extends AppCompatActivity {
    EditText editText ;
    Button button ;
    TextView textView ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setBackgroundColor(Color.parseColor("#FF3CBF37"));
                String idNumber = editText.getText().toString().trim();
                textView.setText(name);

            }
        });

    }
}
