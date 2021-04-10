package com.ghostapps.placapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_score_game.*

class GameScoreActivity: AppCompatActivity() {

    companion object {
        const val TEAM_HOME_NAME = "home_team_name"
        const val TEAM_AWAY_NAME = "away_team_name"
    }

    var basketsOfOneHome = 0
    var basketsOfTwoHome = 0
    var basketsOfThreeHome = 0

    var basketsOfOneAway = 0
    var basketsOfTwoAway = 0
    var basketsOfThreeAway = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_game)

        gameScoreHomeTeamName.text = intent.getStringExtra(TEAM_HOME_NAME)
        gameScoreAwayTeamName.text = intent.getStringExtra(TEAM_AWAY_NAME)

        //Home
        gameScoreHomeIncreaseOne.setOnClickListener {
            basketsOfOneHome++
            updateScore()
        }

        gameScoreHomeIncreaseTwo.setOnClickListener {
            basketsOfTwoHome++
            updateScore()
        }

        gameScoreHomeIncreaseThree.setOnClickListener {
            basketsOfThreeHome++
            updateScore()
        }

        gameScoreHomeDecreaseOne.setOnClickListener {
            if (basketsOfOneHome > 0) {
                basketsOfOneHome--
                updateScore()
            }
        }
        
        gameScoreHomeDecreaseTwo.setOnClickListener {
            if (basketsOfTwoHome > 0) {
                basketsOfTwoHome--
                updateScore()
            }
        }

        gameScoreHomeDecreaseThree.setOnClickListener {
            if (basketsOfThreeHome > 0) {
                basketsOfThreeHome--
                updateScore()
            }
        }

        // Away
        gameScoreAwayIncreaseOne.setOnClickListener {
            basketsOfOneAway++
            updateScore()
        }

        gameScoreAwayIncreaseTwo.setOnClickListener {
            basketsOfTwoAway++
            updateScore()
        }

        gameScoreAwayIncreaseThree.setOnClickListener {
            basketsOfThreeAway++
            updateScore()
        }

        gameScoreAwayDecreaseOne.setOnClickListener {
            if (basketsOfOneAway > 0) {
                basketsOfOneAway--
                updateScore()
            }
        }

        gameScoreAwayDecreaseTwo.setOnClickListener {
            if (basketsOfTwoAway > 0) {
                basketsOfTwoAway--
                updateScore()
            }
        }
        
        gameScoreAwayDecreaseThree.setOnClickListener {
            if (basketsOfThreeAway > 0) {
                basketsOfThreeAway--
                updateScore()
            }
        }

        gameScoreExitButton.setOnClickListener {
            finish()
        }
    }
    
    private fun updateScore() {
        gameScoreHomeTeamScore.text = String.format("%02d", basketsOfOneHome + basketsOfTwoHome * 2 + basketsOfThreeHome * 3)
        gameScoreAwayTeamScore.text = String.format("%02d", basketsOfOneAway + basketsOfTwoAway * 2 + basketsOfThreeAway * 3)

        numberOfBasketsOneHomeCount.text = String.format("%02d", basketsOfOneHome)
        numberOfBasketsTwoHomeCount.text = String.format("%02d", basketsOfTwoHome)
        numberOfBasketsThreeHomeCount.text = String.format("%02d", basketsOfThreeHome)

        numberOfBasketsOneAwayCount.text = String.format("%02d", basketsOfOneAway)
        numberOfBasketsTwoAwayCount.text = String.format("%02d", basketsOfTwoAway)
        numberOfBasketsThreeAwayCount.text = String.format("%02d", basketsOfThreeAway)
    }
}