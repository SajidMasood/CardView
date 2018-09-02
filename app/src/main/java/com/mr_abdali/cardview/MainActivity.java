package com.mr_abdali.cardview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView card1, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        card1 = (CardView) findViewById(R.id.cardview1_id);
        card2 = (CardView) findViewById(R.id.cardview2_id);
        
        
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //<code></code>
                Snackbar.make(view, "Card 1 Selectec",Snackbar.LENGTH_INDEFINITE).show();
            }
        });
        
       card2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               // <code></code>
               Snackbar.make(view, "Card 2 Selectec",Snackbar.LENGTH_INDEFINITE).show();

           }
       }); 
    }
}
