package com.example.android.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView workoutCategories;
    //TODO Instead of creating a textview of workout categories, create several buttons that will link to textviews
    public final void openWorkout1(View view){
        Intent intent = new Intent (this, DisplayWorkout2.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        workoutCategories = (TextView) findViewById(R.id.workout_categories);

        String[] workoutCats = WorkoutCategories.getWorkoutCategories();

        for (String cat : workoutCats){
            workoutCategories.append(cat + "\n \n \n");
        }

        workoutCategories.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                openWorkout1(v);
            }
        });


    }

}
