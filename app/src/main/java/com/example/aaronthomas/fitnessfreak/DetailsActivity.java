package com.example.aaronthomas.fitnessfreak;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseText = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImg = (ImageView)findViewById(R.id.exerciseImg);
        LinearLayout mainBg = (LinearLayout)findViewById(R.id.mainBG);

        // key to pass through title data
        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseText.setText(exerciseTitle);

        // pass in relative image and background colour
        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.weight_icon, getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#ab7fe7"));
        } else {
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.heart_rate, getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#52AD56"));
        }

    }
}
