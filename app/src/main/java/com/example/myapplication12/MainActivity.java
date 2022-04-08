package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private TextView textView2;
    private TextView textView3;
    private EditText editTextNumberDecimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2= findViewById(R.id.button2);
        textView2=findViewById(R.id.textView2);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal);
        textView3=findViewById(R.id.textView3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Value Result!!", Toast.LENGTH_SHORT).show();
                String v = editTextNumberDecimal.getText().toString();
                int v1=Integer.parseInt(v);
                double pound= 2.205 * v1;
                textView3.setText("The corresponding value of kg to pound is "+pound);


            }
        });

    }
}