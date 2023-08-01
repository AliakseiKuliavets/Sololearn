package lottery;

import java.util.Scanner;

public class Lottery {

    private final int[] winningNumbers = new int[5];
    private  int[] customerNumbers;

    public  void run() {

    }
    private void makeCustomerNumbers() {
        int[] customerNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        customerNumbers[0] = scanner.nextInt();
        System.out.print("Введите второе значение: ");
        customerNumbers[1] = scanner.nextInt();
        System.out.print("Введите третье значение: ");
        customerNumbers[2] = scanner.nextInt();
        System.out.print("Введите четвертое значение: ");
        customerNumbers[3] = scanner.nextInt();
        System.out.print("Введите пятое значение: ");
        customerNumbers[4] = scanner.nextInt();
    }
}
