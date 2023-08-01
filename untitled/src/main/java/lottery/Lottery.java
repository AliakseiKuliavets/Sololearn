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
        printWinnAndCustomNumbers();

    }
    private void makeCustomerNumbers() {
        int[] customerNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your \"Lucky numbers\"");
        for (int i = 0; i < customerNumbers.length; i++) {
            System.out.print((i + 1) + " number: ");
            customerNumbers[i] = scanner.nextInt();
            if (customerNumbers[i] < 1 || customerNumbers[i] > 50) {
                System.out.println("Wrong numbers");
            }
        }
        this.customerNumbers = customerNumbers;
    }

    private void makeWinningNumbers() {
        Random random = new Random();
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = random.nextInt(1,51);
        }
    }

    private void printWinnAndCustomNumbers() {
        System.out.println("Winning numbers: " + Arrays.toString(winningNumbers));
        System.out.println("Customer numbers: " + Arrays.toString(customerNumbers));
    }
}
