package com.example.belajarintent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Change4 extends AppCompatActivity implements View.OnClickListener {

    Button change4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);
        change4= (Button)findViewById(R.id.change4);
        change4.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.change4:
                Intent explicit = new Intent(Change4.this, MainActivity.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
