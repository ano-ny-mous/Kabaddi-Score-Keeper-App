package com.example.android.kabaddiscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneForTeamA(View v)
    {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeForTeamA(View v)
    {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneForTeamB(View v)
    {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void addThreeForTeamB(View v)
    {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }



}
