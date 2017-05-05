package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Variables for players final score
    int player1Score = 0;
    int player2Score = 0;

    // Variables indicating how many ships have player 1
    int player1BattleShipNumber = 1;
    int player1CruisersNumber = 2;
    int player1DestroyersNumber = 3;
    int player1SubmarinesNumber = 4;

    // Variables indicating how many ships destroyed player 1
    int player1DestroyedBattleship = 0;
    int player1DestroyedCruisers = 0;
    int player1DestroyedDestroyers = 0;
    int player1DestroyedSubmarines = 0;

    // Variables indicating how many ships have player 2
    int player2BattleShipNumber = 1;
    int player2CruisersNumber = 2;
    int player2DestroyersNumber = 3;
    int player2SubmarinesNumber = 4;

    // Variables indicating how many ships destroyed player 2
    int player2DestroyedBattleship = 0;
    int player2DestroyedCruisers = 0;
    int player2DestroyedDestroyers = 0;
    int player2DestroyedSubmarines = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays player's 1 final score
     */
    public void displayPlayer1Score(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays player's 2 final score
     */
    public void displayPlayer2Score(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays how many player 1 destroyed opponent's battleships
     */
    public void displayPlayer1DestroyedBattleships(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_destroyed_battleships);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays how many player 1 destroyed opponent's cruisers
     */
    public void displayPlayer1DestroyedCruisers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_destroyed_cruisers);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays how many player 1 destroyed opponent's destroyers
     */
    public void displayPlayer1DestroyedDestroyers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_destroyed_destroyers);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays how many player 1 destroyed opponent's submarines
     */
    public void displayPlayer1DestroyedSubmarines(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_destroyed_submarines);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays how many player 2 destroyed opponent's battleships
     */
    public void displayPlayer2DestroyedBattleships(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_destroyed_battleships);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays how many player 2 destroyed opponent's cruisers
     */
    public void displayPlayer2DestroyedCruisers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_destroyed_cruisers);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays how many player 2 destroyed opponent's destroyers
     */
    public void displayPlayer2DestroyedDestroyers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_destroyed_destroyers);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays how many player 2 destroyed opponent's submarines
     */
    public void displayPlayer2DestroyedSubmarines(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_destroyed_submarines);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays player 1 battleship number
     */
    public void displayPlayer1Battleships(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_battleship);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays player 1 cruisers number
     */
    public void displayPlayer1Cruisers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_cruisers);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays player 1 destroyers number
     */
    public void displayPlayer1Destroyers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_destroyers);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays player 1 submarines number
     */
    public void displayPlayer1Submarines(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_submarines);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays player 2 battleship number
     */
    public void displayPlayer2Battleships(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_battleship);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays player 2 cruisers number
     */
    public void displayPlayer2Cruisers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_cruisers);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays player 2 destroyers number
     */
    public void displayPlayer2Destroyers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_destroyers);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays player 2 submarines number
     */
    public void displayPlayer2Submarines(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_submarines);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Player 1 destroys opponent's battleship
     */
    public void player1Battleship(View v) {
        /**
         *If player 1 already destroyed all opponent's battleships, this if statement doesn't allow to make negative number of ships
         */
        if (player2BattleShipNumber == 0) {
            return;
        }

        //decrease number of player's 2 battleship
        player2BattleShipNumber -= 1;
        //increase number of player's 1 destroyed battleship
        player1DestroyedBattleship += 1;
        //Shows that new information on the screen
        displayPlayer1DestroyedBattleships(player1DestroyedBattleship);
        displayPlayer2Battleships(player2BattleShipNumber);

        //checks if that was the last player's 2 ship. If yes, gives 1 point to player 1 and shows a message to start new game
        if (player2BattleShipNumber == 0 && player2CruisersNumber == 0 && player2DestroyersNumber == 0 && player2SubmarinesNumber == 0) {
            player1Score = player1Score + 1;
            displayPlayer1Score(player1Score);
            Toast.makeText(this, getString(R.string.toast_player1won), Toast.LENGTH_LONG).show();
            return;
        }

    }


    /**
     * Player 1 destroys opponent's cruiser
     */
    public void player1Cruisers(View v) {
        if (player2CruisersNumber == 0) {
            return;
        }

        player2CruisersNumber -= 1;
        player1DestroyedCruisers += 1;
        displayPlayer1DestroyedCruisers(player1DestroyedCruisers);
        displayPlayer2Cruisers(player2CruisersNumber);

        if (player2BattleShipNumber == 0 && player2CruisersNumber == 0 && player2DestroyersNumber == 0 && player2SubmarinesNumber == 0) {
            player1Score = player1Score + 1;
            displayPlayer1Score(player1Score);
            Toast.makeText(this, getString(R.string.toast_player1won), Toast.LENGTH_LONG).show();
            return;
        }
    }

    /**
     * Player 1 destroys opponent's destroyer
     */
    public void player1Destroyers(View v) {
        if (player2DestroyersNumber == 0) {
            return;
        }
        player2DestroyersNumber -= 1;
        player1DestroyedDestroyers += 1;
        displayPlayer1DestroyedDestroyers(player1DestroyedDestroyers);
        displayPlayer2Destroyers(player2DestroyersNumber);

        if (player2BattleShipNumber == 0 && player2CruisersNumber == 0 && player2DestroyersNumber == 0 && player2SubmarinesNumber == 0) {
            player1Score = player1Score + 1;
            displayPlayer1Score(player1Score);
            Toast.makeText(this, getString(R.string.toast_player1won), Toast.LENGTH_LONG).show();
            return;
        }
    }

    /**
     * Player 1 destroys opponent's submarine
     */
    public void player1Submarines(View v) {
        if (player2SubmarinesNumber == 0) {
            return;
        }
        player2SubmarinesNumber -= 1;
        player1DestroyedSubmarines += 1;
        displayPlayer1DestroyedSubmarines(player1DestroyedSubmarines);
        displayPlayer2Submarines(player2SubmarinesNumber);

        if (player2BattleShipNumber == 0 && player2CruisersNumber == 0 && player2DestroyersNumber == 0 && player2SubmarinesNumber == 0) {
            player1Score = player1Score + 1;
            displayPlayer1Score(player1Score);
            Toast.makeText(this, getString(R.string.toast_player1won), Toast.LENGTH_LONG).show();
            return;
        }
    }


    /**
     * Player 2 destroys opponent's battleship
     */
    public void player2Battleship(View v) {
        /**
         *If player 2 already destroyed all opponent's battleships, this if statement doesn't allow to make negative number of ships
         */
        if (player1BattleShipNumber == 0) {
            return;
        }

        //decrease number of player's 1 battleship
        player1BattleShipNumber -= 1;
        //increase number of player's 1 destroyed battleship
        player2DestroyedBattleship += 1;
        //Shows that new information on the screen
        displayPlayer2DestroyedBattleships(player2DestroyedBattleship);
        displayPlayer1Battleships(player1BattleShipNumber);

        //checks if that was the last player's 1 ship. If yes, gives 1 point to player 2 and shows a message to start new game
        if (player1BattleShipNumber == 0 && player1CruisersNumber == 0 && player1DestroyersNumber == 0 && player1SubmarinesNumber == 0) {
            player2Score = player2Score + 1;
            displayPlayer2Score(player2Score);
            Toast.makeText(this, getString(R.string.toast_player2won), Toast.LENGTH_LONG).show();
            return;
        }
    }


    /**
     * Player 2 destroys opponent's cruiser
     */
    public void player2Cruisers(View v) {
        if (player1CruisersNumber == 0) {
            return;
        }
        player1CruisersNumber -= 1;
        player2DestroyedCruisers += 1;
        displayPlayer2DestroyedCruisers(player2DestroyedCruisers);
        displayPlayer1Cruisers(player1CruisersNumber);

        if (player1BattleShipNumber == 0 && player1CruisersNumber == 0 && player1DestroyersNumber == 0 && player1SubmarinesNumber == 0) {
            player2Score = player2Score + 1;
            displayPlayer2Score(player2Score);
            Toast.makeText(this, getString(R.string.toast_player2won), Toast.LENGTH_LONG).show();
            return;
        }
    }

    /**
     * Player 2 destroys opponent's destroyer
     */
    public void player2Destroyers(View v) {
        if (player1DestroyersNumber == 0) {
            return;
        }
        player1DestroyersNumber -= 1;
        player2DestroyedDestroyers += 1;
        displayPlayer2DestroyedDestroyers(player2DestroyedDestroyers);
        displayPlayer1Destroyers(player1DestroyersNumber);

        if (player1BattleShipNumber == 0 && player1CruisersNumber == 0 && player1DestroyersNumber == 0 && player1SubmarinesNumber == 0) {
            player2Score = player2Score + 1;
            displayPlayer2Score(player2Score);
            Toast.makeText(this, getString(R.string.toast_player2won), Toast.LENGTH_LONG).show();
            return;
        }
    }

    /**
     * Player 2 destroys opponent's submarine
     */
    public void player2Submarines(View v) {
        if (player1SubmarinesNumber == 0) {
            return;
        }
        player1SubmarinesNumber -= 1;
        player2DestroyedSubmarines += 1;
        displayPlayer2DestroyedSubmarines(player2DestroyedSubmarines);
        displayPlayer1Submarines(player1SubmarinesNumber);

        if (player1BattleShipNumber == 0 && player1CruisersNumber == 0 && player1DestroyersNumber == 0 && player1SubmarinesNumber == 0) {
            player2Score = player2Score + 1;
            displayPlayer2Score(player2Score);
            Toast.makeText(this, getString(R.string.toast_player2won), Toast.LENGTH_LONG).show();
            return;
        }
    }


    /**
     * Starts new game where both players have all their ships again.
     */
    public void newGame(View v) {
        player1BattleShipNumber = 1;
        player1CruisersNumber = 2;
        player1DestroyersNumber = 3;
        player1SubmarinesNumber = 4;

        player1DestroyedBattleship = 0;
        player1DestroyedCruisers = 0;
        player1DestroyedDestroyers = 0;
        player1DestroyedSubmarines = 0;

        player2BattleShipNumber = 1;
        player2CruisersNumber = 2;
        player2DestroyersNumber = 3;
        player2SubmarinesNumber = 4;

        player2DestroyedBattleship = 0;
        player2DestroyedCruisers = 0;
        player2DestroyedDestroyers = 0;
        player2DestroyedSubmarines = 0;

        displayPlayer1Battleships(player1BattleShipNumber);
        displayPlayer1Cruisers(player1CruisersNumber);
        displayPlayer1Destroyers(player1DestroyersNumber);
        displayPlayer1Submarines(player1SubmarinesNumber);

        displayPlayer1DestroyedBattleships(player1DestroyedBattleship);
        displayPlayer1DestroyedCruisers(player1DestroyedCruisers);
        displayPlayer1DestroyedDestroyers(player1DestroyedDestroyers);
        displayPlayer1DestroyedSubmarines(player1DestroyedSubmarines);

        displayPlayer2Battleships(player2BattleShipNumber);
        displayPlayer2Cruisers(player2CruisersNumber);
        displayPlayer2Destroyers(player2DestroyersNumber);
        displayPlayer2Submarines(player2SubmarinesNumber);

        displayPlayer2DestroyedBattleships(player2DestroyedBattleship);
        displayPlayer2DestroyedCruisers(player2DestroyedCruisers);
        displayPlayer2DestroyedDestroyers(player2DestroyedDestroyers);
        displayPlayer2DestroyedSubmarines(player2DestroyedSubmarines);

    }


    /**
     * Resets all stats, even final scores
     */
    public void reset(View v) {
        player1Score = 0;
        player2Score = 0;

        player1BattleShipNumber = 1;
        player1CruisersNumber = 2;
        player1DestroyersNumber = 3;
        player1SubmarinesNumber = 4;

        player1DestroyedBattleship = 0;
        player1DestroyedCruisers = 0;
        player1DestroyedDestroyers = 0;
        player1DestroyedSubmarines = 0;

        player2BattleShipNumber = 1;
        player2CruisersNumber = 2;
        player2DestroyersNumber = 3;
        player2SubmarinesNumber = 4;

        player2DestroyedBattleship = 0;
        player2DestroyedCruisers = 0;
        player2DestroyedDestroyers = 0;
        player2DestroyedSubmarines = 0;

        displayPlayer1Score(player1Score);
        displayPlayer2Score(player2Score);

        displayPlayer1Battleships(player1BattleShipNumber);
        displayPlayer1Cruisers(player1CruisersNumber);
        displayPlayer1Destroyers(player1DestroyersNumber);
        displayPlayer1Submarines(player1SubmarinesNumber);

        displayPlayer1DestroyedBattleships(player1DestroyedBattleship);
        displayPlayer1DestroyedCruisers(player1DestroyedCruisers);
        displayPlayer1DestroyedDestroyers(player1DestroyedDestroyers);
        displayPlayer1DestroyedSubmarines(player1DestroyedSubmarines);

        displayPlayer2Battleships(player2BattleShipNumber);
        displayPlayer2Cruisers(player2CruisersNumber);
        displayPlayer2Destroyers(player2DestroyersNumber);
        displayPlayer2Submarines(player2SubmarinesNumber);

        displayPlayer2DestroyedBattleships(player2DestroyedBattleship);
        displayPlayer2DestroyedCruisers(player2DestroyedCruisers);
        displayPlayer2DestroyedDestroyers(player2DestroyedDestroyers);
        displayPlayer2DestroyedSubmarines(player2DestroyedSubmarines);

    }


}
