package com.example.belajarintent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Change2 extends AppCompatActivity implements View.OnClickListener{

    Button change2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        change2= (Button)findViewById(R.id.change2);
        change2.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.change2:
                Intent explicit = new Intent(Change2.this, Change3.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
