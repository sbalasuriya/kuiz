package com.example.balasurya.kuiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    int score;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Bundle b=getIntent().getExtras();
        String scr=b.getString("score");
        Toast.makeText(getApplicationContext(),"Score="+scr,Toast.LENGTH_SHORT).show();
        score=Integer.parseInt(scr);
        b1=(Button)findViewById(R.id.button12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main6Activity.this,Main7Activity.class);
                Bundle b=new Bundle();
                score=score+1;
                String a=String.valueOf(score);
                b.putString("score",a);
                i.putExtras(b);
                startActivity(i);
            }
        });
        b2=(Button)findViewById(R.id.button11);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main6Activity.this,Main7Activity.class);
                Bundle b=new Bundle();
                score=score+0;
                String a=String.valueOf(score);
                b.putString("score",a);
                i.putExtras(b);
                startActivity(i);
            }
        });
        b3=(Button)findViewById(R.id.button10);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main6Activity.this,Main7Activity.class);
                Bundle b=new Bundle();
                score=score+0;
                String a=String.valueOf(score);
                b.putString("score",a);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}

