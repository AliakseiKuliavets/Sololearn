package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void run() {
        char mathChar;
        Double result;
        System.out.print("Enter character: ");
        mathChar = getNextLine().charAt(0);
        while (true) {
            if (mathChar == 'E') {
                closeProgram();
            }
            result = userInputRouter(mathChar, getInputNumbersArray());
            System.out.println(result);
        }
    }

    private double[] getInputNumbersArray() {
        System.out.print("Enter number of arguments 2 and more: ");
        int amount = Integer.parseInt(getNextLine());
        double[] inputNumbersArray = new double[amount];
        for (int i = 0; i < inputNumbersArray.length; i++) {
            System.out.print("Enter " + (i + 1) + " value: ");
            inputNumbersArray[i] = Double.parseDouble(getNextLine());
        }
        return inputNumbersArray;
    }

    private void closeProgram() {
        System.exit(1);
    }

    private String getNextLine() {
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


    private Double multiplication(double[] inputNumbers) {
        Double result = inputNumbers[0];
        for (int i = 1; i < inputNumbers.length; i++) {
            result = result * inputNumbers[i];
        }
        System.out.print("Multiplication result: ");
        return result;
    }

    private Double divide(double[] inputNumbers) {
        Double result = inputNumbers[0];
        for (int i = 1; i < inputNumbers.length; i++) {
            if (inputNumbers[i] != 0.0) {
                result = result / inputNumbers[i];
            } else {
                System.out.print("Can't divide by zero");
                return null;
            }
        }
        System.out.print("division result: ");
        return result;
    }

    private Double sum(double[] inputNumbers) {
        Double result = inputNumbers[0];
        for (int i = 1; i < inputNumbers.length; i++) {
            result = result + inputNumbers[i];
        }
        System.out.print("Addition result: ");
        return result;
    }

    private Double subtract(double[] inputNumbers) {
        Double result = inputNumbers[0];
        for (int i = 1; i < inputNumbers.length; i++) {
            result = result - inputNumbers[i];
        }
        System.out.print("Subtraction result: ");
        return result;
    }


    private Double userInputRouter(char inputChar, double[] inputNumbers) {
        switch (inputChar) {
            case '*':
                return multiplication(inputNumbers);
            case '/':
                return divide(inputNumbers);
            case '+':
                return sum(inputNumbers);
            case '-':
                return subtract(inputNumbers);
            default:
                System.out.println("Not valid value");
                return null;
        }
    }
}
