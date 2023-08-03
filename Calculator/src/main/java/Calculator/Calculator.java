package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void run() {
        String nextLine;
        Double result;
        while (true) {
            nextLine = getNextLine();
            if (nextLine.equals("E")) {
                closeProgram();
            }
            result = userInputRouter(nextLine.charAt(0));
            System.out.println(result);
        }
    }

    private void closeProgram() {
        System.exit(1);
    }

    private String getNextLine() {
        System.out.print("Enter character");
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private double getDoubleFromCommandLine() {
        System.out.print("Enter the number ");
        return scanner.nextDouble();
    }


    private double multiplication(double first, double second) {
        System.out.println("Multiplication result: ");
        return first * second;
    }

    private double divide(double dividend, double divisor) {
        if (divisor != 0.0) {
            System.out.println("Division result: ");
            return dividend / divisor;
        } else {
            System.out.println("Can't divide by zero");
            return -1;
        }
    }

    private double sum(double first, double second) {
        System.out.println("Addition result: ");
        return first + second;
    }

    private double subtract(double reduced, double subtracted) {
        System.out.println("Subtraction result: ");
        return reduced - subtracted;
    }


    private Double userInputRouter(char inputChar) {
        switch (inputChar) {
            case '*':
                double first = getDoubleFromCommandLine();
                double second = getDoubleFromCommandLine();

                return multiplication(first, second);
            case '/':
                return divide(getDoubleFromCommandLine(), getDoubleFromCommandLine());
            case '+':
                return sum(getDoubleFromCommandLine(), getDoubleFromCommandLine());
            case '-':
                return subtract(getDoubleFromCommandLine(), getDoubleFromCommandLine());
            default:
                System.out.println("Not valid value");
                return null;
        }
    }
}
