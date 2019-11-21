package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the  score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by three points.
     * @param view
     */
    public void AddThreePointsTeamA(View view) {

        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Increase the score for Team A by two points.
     * @param view
     */
    public void AddTwoPointsTeamA(View view) {

        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Increase the score for team A by one point.
     * @param view
     */
    public void AddOnePointTeamA(View view) {

        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Displays the  score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by three points.
     * @param view
     */
    public void AddThreePointsTeamB(View view) {

        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Increase the score for Team B by two points.
     * @param view
     */
    public void AddTwoPointsTeamB(View view) {

        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Increase the score for team B by one point.
     * @param view
     */
    public void AddOnePointTeamB(View view) {

        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);

    }

    public void resetTeamsScore(View view) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
