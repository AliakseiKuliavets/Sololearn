package lottery;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    private final int[] winningNumbers = new int[5];
    private  int[] customerNumbers;

    public void run() {
        makeCustomerNumbers();
        makeWinningNumbers();
        checkWinnings();
        printWinnAndCustomNumbers();

    }
    private void makeCustomerNumbers() {
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
        this.customerNumbers = customerNumbers;
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

    private void checkWinnings() {
        int count = 0;
        for (int customerNumber : customerNumbers) {
            for (int winningNumber : winningNumbers) {
                if (customerNumbers == winningNumbers) {
                    count++;
                }
            }
        }
        if (count >= 3) {
            System.out.println("Your win");
        } else {
            System.out.println("Try again");
        }
    }

    private void printWinnAndCustomNumbers() {
        System.out.println("Winning numbers: " + Arrays.toString(winningNumbers));
        System.out.println("Customer numbers: " + Arrays.toString(customerNumbers));
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
