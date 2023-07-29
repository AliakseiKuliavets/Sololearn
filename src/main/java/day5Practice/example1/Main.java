/*Guess the number game. In this game, the computer guesses a random number, and the player must guess it,
        receiving hints after each attempt.*/


package day5Practice.example1;

public class Main {
    public static void main(String[] args) {
        ActionGame actionGame = new ActionGame();
        actionGame.startGame();
        actionGame.getGuessNum();
    }
}
