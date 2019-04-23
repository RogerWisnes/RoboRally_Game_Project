package inf112.skeleton.app.Helpers;

import inf112.skeleton.app.Enums.CardState;
import inf112.skeleton.app.Enums.GameState;
import inf112.skeleton.app.Enums.RoundState;


public class StateHolder {
    private CardState cardState;
    private RoundState roundState;
    private GameState gameState;
    private int numberOfPlayers;
    private int playerTurn;

    public StateHolder(CardState cardState, RoundState roundState, GameState gameState, int players) {
        this.cardState = cardState;
        this.roundState = roundState;
        this.gameState = gameState;
        this.numberOfPlayers = players;
        this.playerTurn = 1;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public int incrementPlayerTurn(){
        if (playerTurn == numberOfPlayers){
            return playerTurn = 1;
        }
        return ++playerTurn;
    }

    public CardState getCardState() {
        return cardState;
    }

    public void setCardState(CardState cardState) {
        this.cardState = cardState;
    }

    public RoundState getRoundState() {
        return roundState;
    }

    public void setRoundState(RoundState roundState) {
        this.roundState = roundState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}

