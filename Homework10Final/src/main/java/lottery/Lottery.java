package lottery;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    private final int[] winningNumbers = new int[5];
    private int[] firstCustomNumber;
    private int[] secondCustomNumber;
    private int[] thirdCustomNumber;

    public void run() {
        makeTreeArrays();
        makeWinningNumbers();
        printWinnNumbers();
        printCustomerNumbers();

    }
    private int[] makeCustomerNumbers() {
        int[] customerNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your \"Lucky numbers\"");
        int i = 0;
        while (i < customerNumbers.length) {
            System.out.print((i + 1) + " number: ");
            int numberLuck = scanner.nextInt();
            if (!(isThisNumberPresentInArray(numberLuck , customerNumbers ))) {
                customerNumbers[i] = numberLuck;
                i++;
            }
        }
        return customerNumbers;
    }

    // создана для теста
    public int[] getMakeCustomerNumbers() {
        return makeCustomerNumbers();
    }

    private void makeTreeArrays() {
        firstCustomNumber = this.makeCustomerNumbers();
        secondCustomNumber = this.makeCustomerNumbers();
        thirdCustomNumber = this.makeCustomerNumbers();
    }

    private void makeWinningNumbers() {
        Random random = new Random();
        int i = 0;
        int randomNumber;
        while (i < winningNumbers.length) {
            randomNumber = random.nextInt(1,51);

            if (!(isThisNumberPresentInArray(randomNumber , winningNumbers ))) {
                winningNumbers[i] = randomNumber;
                i++;
            }
        }
    }

    private void checkWinnings(int[] customNumbers) {
        int count = 0;
        for (int customNumber : customNumbers) {
            for (int winningNumber : winningNumbers) {
                if (customNumber == winningNumber) {
                    count++;
                }
            }
        }
        if (count >= 3) {
            System.out.println("You lost");
        } else {
            System.out.println("Try again");
        }
    }

    private void printWinnNumbers() {
        System.out.println("Winning numbers: " + Arrays.toString(winningNumbers));
    }

    private void printCustomerNumbers() {
        System.out.println();
        checkWinnings(firstCustomNumber);
        System.out.println("firstCustomNumbers: " + Arrays.toString(firstCustomNumber));
        checkWinnings(secondCustomNumber);
        System.out.println("secondCustomNumber: " + Arrays.toString(secondCustomNumber));
        checkWinnings(thirdCustomNumber);
        System.out.println("thirdCustomNumber: " + Arrays.toString(thirdCustomNumber));
    }

    private boolean isThisNumberPresentInArray(int targetNumber, int[] array) {
        for (int currentNumber: array) {
            if (currentNumber == targetNumber) {
                return true;
            }
        }
        return false;
    }

}

