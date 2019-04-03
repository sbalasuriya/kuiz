package com.example.balasurya.kuiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button button,b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toast.makeText(getApplicationContext(),"Select the Category",Toast.LENGTH_SHORT).show();
        button=(Button) findViewById(R.id.button35);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main3Activity.this,Main15Activity.class);
                startActivity(i);
            }
        });
        b1=(Button) findViewById(R.id.button36);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main3Activity.this,Main22Activity.class);
                startActivity(i);
            }
        });
        b2=(Button) findViewById(R.id.button37);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main3Activity.this,Main28Activity.class);
                startActivity(i);
            }
        });
    }
}
