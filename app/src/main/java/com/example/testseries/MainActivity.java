package com.example.testseries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText number;
    private Button button;
    private TextView display;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "GOOD MORNING !!!", Toast.LENGTH_SHORT).show();
        button=findViewById(R.id.button);
        display=findViewById(R.id.display);
        number=findViewById(R.id.number);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer buffer = new StringBuffer();
                String s = number.getText().toString();
                int num = Integer.parseInt(s);
                for (int i=1;i<=10;i++)
                {
                    int ans = (i*num);
                    buffer.append("\n"+i+"X"+num+"="+ ans+"\n");
                }
                display.setText(buffer);
            }
        });



    }
}