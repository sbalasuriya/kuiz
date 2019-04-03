package com.example.balasurya.kuiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main33Activity extends AppCompatActivity {

    TextView t;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);
        Bundle b=getIntent().getExtras();
        String scr=b.getString("score");
        t=(TextView)findViewById(R.id.textView34);
        t.setText(scr);
        button=(Button)findViewById(R.id.button88);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main33Activity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
