package com.example.janiraiski.icehockeyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateDisplayHomeGoals(homeGoals);
        updateDisplayAwayGoals(awayGoals);
        updateDisplayHomePenalties(homePenalties);
        updateDisplayAwayPenalties(awayPenalties);
    }

    int homeGoals = 0;
    int awayGoals = 0;
    int homePenalties = 0;
    int awayPenalties = 0;

    public void addHomeGoal(View v) {
        homeGoals += 1;
        updateDisplayHomeGoals(homeGoals);
    }

    public void addAwayGoal(View v) {
        awayGoals += 1;
        updateDisplayAwayGoals(awayGoals);
    }

    public void addHomeTwoMinutes(View v) {
        homePenalties += 2;
        updateDisplayHomePenalties(homePenalties);
    }

    public void addHomeFiveMinutes(View v) {
        homePenalties += 5;
        updateDisplayHomePenalties(homePenalties);
    }

    public void addAwayTwoMinutes(View v) {
        awayPenalties += 2;
        updateDisplayAwayPenalties(awayPenalties);
    }

    public void addAwayFiveMinutes(View v) {
        awayPenalties += 5;
        updateDisplayAwayPenalties(awayPenalties);
    }

    public void updateDisplayHomeGoals(int homeGoals) {
        TextView scoreView = (TextView) findViewById(R.id.goals_home);
        scoreView.setText(String.valueOf(homeGoals));
    }

    public void updateDisplayAwayGoals(int awayGoals) {
        TextView scoreView = (TextView) findViewById(R.id.goals_away);
        scoreView.setText(String.valueOf(awayGoals));
    }

    public void updateDisplayHomePenalties(int homePenalties) {
        TextView scoreView = (TextView) findViewById(R.id.penalties_home);
        scoreView.setText(String.valueOf(homePenalties));
    }

    public void updateDisplayAwayPenalties(int awayPenalties) {
        TextView scoreView = (TextView) findViewById(R.id.penalties_away);
        scoreView.setText(String.valueOf(awayPenalties));
    }

    public void reset(View v) {
        homeGoals = 0;
        awayGoals = 0;
        homePenalties = 0;
        awayPenalties = 0;
        updateDisplayHomeGoals(homeGoals);
        updateDisplayAwayGoals(awayGoals);
        updateDisplayHomePenalties(homePenalties);
        updateDisplayAwayPenalties(awayPenalties);
    }

}
