package com.example.balasurya.kuiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main28Activity extends AppCompatActivity {

    int score=0;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main28);
        b1=(Button)findViewById(R.id.button73);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main28Activity.this,Main29Activity.class);
                Bundle b=new Bundle();
                score=score+1;
                String a=String.valueOf(score);
                b.putString("score",a);
                i.putExtras(b);
                startActivity(i);
            }
        });
        b2=(Button)findViewById(R.id.button74);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Main28Activity.this,Main28Activity.class);
                Bundle b=new Bundle();
                score=score-1;
                String a=String.valueOf(score);
                b.putString("score",a);
                i.putExtras(b);
                startActivity(i);
            }
        });
        b3=(Button)findViewById(R.id.button75);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Wrong answer",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Main28Activity.this,Main28Activity.class);
                Bundle b=new Bundle();
                score=score-1;
                String a=String.valueOf(score);
                b.putString("score",a);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}
