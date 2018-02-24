package com.example.android.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DisplayPPLProgram extends AppCompatActivity {

    Button aboutPPLBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pplprogram);

        aboutPPLBut = (Button)findViewById(R.id.about_ppl);
        aboutPPLBut.setText("About PPL Program");
        aboutPPLBut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                openAboutPPL(v);
                //workoutSchedule.setText("AfterClick");

            }
        });

    }

    public final void openAboutPPL(View view){
        Intent intent = new Intent(this,DisplayAboutPPL.class);
        startActivity(intent);
    }
}
