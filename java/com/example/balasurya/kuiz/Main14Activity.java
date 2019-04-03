package com.example.balasurya.kuiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main14Activity extends AppCompatActivity {

    TextView t;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        Bundle b=getIntent().getExtras();
        String scr=b.getString("score");
        t=(TextView)findViewById(R.id.textView11);
        t.setText(scr);
        button=(Button)findViewById(R.id.button34);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main14Activity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
