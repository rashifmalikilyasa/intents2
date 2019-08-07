package com.example.belajarintent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button change1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        change1= (Button)findViewById(R.id.change1);
        change1.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.change1:
                Intent explicit = new Intent(MainActivity.this, Change2.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}
