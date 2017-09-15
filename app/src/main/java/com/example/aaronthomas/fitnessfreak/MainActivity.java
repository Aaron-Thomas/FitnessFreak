package com.example.aaronthomas.fitnessfreak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_WEIGHTS = "Weight lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // outlets
        RelativeLayout weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = (RelativeLayout)findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);

        // actions
        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });
    }

    // load activity function
    private void loadDetailActivity(String excerciseTitle) {

    }
}
