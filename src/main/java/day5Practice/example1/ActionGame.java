package day5Practice.example1;

import java.util.Random;
import java.util.Scanner;

public class ActionGame {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private int maxNumber = 100;
    private int secretNumber =  random.nextInt(maxNumber);

    int guessedNumber;

    public void startGame() {
        System.out.println();
        System.out.println("Welcome to game \"Guess the number !\"");
        System.out.println();
        System.out.println("I guessed a number from 1 to " + maxNumber + " try to guess");


    }

    private void guessNum() {
        int attempts = 0;
        do {
        System.out.print("Your number: ");
        guessedNumber = scanner.nextInt();
        attempts++;

        if (guessedNumber > secretNumber) {
            System.out.println("My number is less than " + guessedNumber);
        } else if (guessedNumber < secretNumber) {
            System.out.println("My number is more than " + guessedNumber);
        } else {
            System.out.println("Wow, yes my num i`ts: " + secretNumber + " it took you " + attempts + " tires");
        }
        } while (guessedNumber != secretNumber);
        scanner.close();
    }

    public void getGuessNum() {
        guessNum();
    }



}
