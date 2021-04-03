package com.ghostapps.placapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_score_game.*

class GameScoreActivity: AppCompatActivity() {

    companion object {
        const val TEAM_HOME_NAME = "home_team_name"
        const val TEAM_AWAY_NAME = "away_team_name"
    }
    
    var homeTeamScore = 0
    var awayTeamScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_game)

        gameScoreHomeTeamName.text = intent.getStringExtra(TEAM_HOME_NAME)
        gameScoreAwayTeamName.text = intent.getStringExtra(TEAM_AWAY_NAME)

        //Home
        gameScoreHomeIncreaseOne.setOnClickListener {
            homeTeamScore++
            updateScore()
        }

        gameScoreHomeIncreaseTwo.setOnClickListener {
            homeTeamScore+=2
            updateScore()
        }

        gameScoreHomeIncreaseThree.setOnClickListener {
            homeTeamScore+=3
            updateScore()
        }

        gameScoreHomeDecreaseOne.setOnClickListener {
            homeTeamScore--
            updateScore()
        }
        
        gameScoreHomeDecreaseTwo.setOnClickListener {
            homeTeamScore-=2
            updateScore()
        }

        gameScoreHomeDecreaseThree.setOnClickListener {
            homeTeamScore-=3
            updateScore()
        }

        // Away
        gameScoreAwayIncreaseOne.setOnClickListener {
            awayTeamScore++
            updateScore()
        }

        gameScoreAwayIncreaseTwo.setOnClickListener {
            awayTeamScore+=2
            updateScore()
        }

        gameScoreAwayIncreaseThree.setOnClickListener {
            awayTeamScore+=3
            updateScore()
        }

        gameScoreAwayDecreaseOne.setOnClickListener {
            awayTeamScore--
            updateScore()
        }

        gameScoreAwayDecreaseTwo.setOnClickListener {
            awayTeamScore-=2
            updateScore()
        }
        
        gameScoreAwayDecreaseThree.setOnClickListener {
            awayTeamScore-=3
            updateScore()
        }

        gameScoreExitButton.setOnClickListener {
            finish()
        }
    }
    
    private fun updateScore() {
        if (homeTeamScore < 0) homeTeamScore = 0;
        if (awayTeamScore < 0) awayTeamScore = 0;

        gameScoreHomeTeamScore.text = String.format("%02d", homeTeamScore)
        gameScoreAwayTeamScore.text = String.format("%02d", awayTeamScore)
    }

}