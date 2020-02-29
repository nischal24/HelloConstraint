package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button countButton,toastButton,zeroButton;
    private TextView textView;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countButton=findViewById(R.id.countButton);
        toastButton=findViewById(R.id.toastButton);
        zeroButton=findViewById(R.id.zeroButton);
        textView=findViewById(R.id.textView);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(textView!=null)
                {
                    textView.setText(Integer.toString(count));
                    zeroButton.setBackgroundColor(Color.MAGENTA);
                }
                switch(count % 2)
                {
                    case 0: view.setBackgroundColor(Color.GREEN);
                    break;
                    case 1: view.setBackgroundColor(Color.parseColor("#3F51B5"));
                    break;
                }

            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                zeroButton.setBackgroundColor(Color.GRAY);
                countButton.setBackgroundColor(Color.parseColor("#3F51B5"));
                textView.setText(Integer.toString(count));
            }
        });

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,R.string.toast_message, Toast.LENGTH_LONG).show();
            }
        });
    }

}
