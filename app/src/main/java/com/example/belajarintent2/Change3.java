package com.example.belajarintent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Change3 extends AppCompatActivity implements View.OnClickListener {

    Button change3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        change3= (Button)findViewById(R.id.change3);
        change3.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.change3:
                Intent explicit = new Intent(Change3.this, Change4.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
