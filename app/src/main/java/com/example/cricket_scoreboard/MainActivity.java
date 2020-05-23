package com.example.cricket_scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvScore_team1, tvScore_team2, tvOut_team1, tvOut_team2;
    Button btnFour_team1, btnFour_team2, btnSix_team1, btnSix_team2,
            btnRun_team1, btnRun_team2, btnOut_team1, btnOut_team2, btnReset;

    public int finalScoreTeam1 = 0, finalScoreTeam2 = 0,
                 outPlayerTeam1 = 0, outPlayerTeam2 = 0;
    public static final int four = 4, six = 6, increment = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView
        tvScore_team1 = findViewById(R.id.tvScore_team1);
        tvScore_team2 = findViewById(R.id.tvScore_team2);
        tvOut_team1 = findViewById(R.id.tvOut_team1);
        tvOut_team2 = findViewById(R.id.tvOut_team2);
        // ButtonView
        btnFour_team1 = findViewById(R.id.btnFour_team1);
        btnFour_team2 = findViewById(R.id.btnFour_team2);
        btnSix_team1 = findViewById(R.id.btnSix_team1);
        btnSix_team2 = findViewById(R.id.btnSix_team2);
        btnRun_team1 = findViewById(R.id.btnRun_team1);
        btnRun_team2 = findViewById(R.id.btnRun_team2);
        btnOut_team1 = findViewById(R.id.btnOut_team1);
        btnOut_team2 = findViewById(R.id.btnOut_team2);
        btnReset = findViewById(R.id.btnReset);
        /*
         *  Resetting all Final Scores
         */
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetAllScore();
            }
        });
    }
    private void resetAllScore() {
        finalScoreTeam1 = 0;
        finalScoreTeam2 = 0;
        outPlayerTeam1 = 0;
        outPlayerTeam2 = 0;
        tvScore_team1.setText(String.valueOf(finalScoreTeam1));
        tvScore_team2.setText(String.valueOf(finalScoreTeam2));
        tvOut_team1.setText(String.valueOf(outPlayerTeam1));
        tvOut_team2.setText(String.valueOf(outPlayerTeam2));
    }

    /*
     * Calculating Team1 Final Score
     */
    public void teamFirst_score(View v) {

        switch (v.getId()) {
            case R.id.btnSix_team1:
                 // Adding Six to Final Scores
                finalScoreTeam1 += six;
                break;

            case R.id.btnFour_team1:
                 // Adding Four to Final Scores
                finalScoreTeam1 += four;
                break;

            case R.id.btnRun_team1:
                // Adding One to Final Scores
                finalScoreTeam1 += increment;
                break;

            case R.id.btnOut_team1:
                // Player Out Update
                outPlayerTeam1++;
                if(outPlayerTeam1 <= 10){
                    tvOut_team1.setText(String.valueOf(outPlayerTeam1));
                }else {
                    Toast.makeText(MainActivity.this, "Only 10 Members are allowed to Play", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
       tvScore_team1.setText(String.valueOf(finalScoreTeam1));
    }
    /*
     * Calculating Team1 Final Score
     */
    public void teamSecond_score(View v) {

        switch (v.getId()) {
            case R.id.btnSix_team2:
                // Adding Six to Final Scores
                finalScoreTeam2 += six;
                break;

            case R.id.btnFour_team2:
                // Adding Four to Final Scores
                finalScoreTeam2 += four;
                break;

            case R.id.btnRun_team2:
                // Adding One to Final Scores
                finalScoreTeam2 += increment;
                break;

            case R.id.btnOut_team2:
                // Player Out Update
                outPlayerTeam2++;
                if(outPlayerTeam2 <= 10){
                    tvOut_team2.setText(String.valueOf(outPlayerTeam2));
                }else {
                    Toast.makeText(MainActivity.this, "Only 10 Members are allowed to Play", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
        tvScore_team2.setText(String.valueOf(finalScoreTeam2));
    }
}