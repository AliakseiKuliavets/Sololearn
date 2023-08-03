package Calculator;

import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
//while (true)
        System.out.println(userInputRouter(getCharFromCommandLine()));
    }

    private char getCharFromCommandLine() {
        System.out.println("Введите символ");
        return scanner.nextLine().charAt(0); //здесь возвращаем только первый символ
    }

    private double getDoubleFromCommandLine() {
        System.out.print("Введите число: ");
        return scanner.nextDouble();
    }


    private double multiplication(double first, double second) {
        System.out.println("Результат умножения");
        return first * second;
    }

    private double divide(double dividend, double divisor) {
        if (divisor != 0.0) {
            System.out.println("Результат деления: ");
            return dividend/divisor;
        } else {
            System.out.println("На ноль делить нельзя");
            return -1;
        }
    }
    private double sum ( double first, double second){
        System.out.println("Результат сложения");
        return first + second;
    }

    private double subtract ( double reduced, double subtracted){
        System.out.println("Результат вычитания");
        return reduced - subtracted;
    }


    private double userInputRouter ( char inputChar){
        switch (inputChar) {
            case '*':
                return multiplication(getDoubleFromCommandLine(), getDoubleFromCommandLine());
            case '/':
                return divide(getDoubleFromCommandLine(), getDoubleFromCommandLine());
            case '+':
                return sum(getDoubleFromCommandLine(), getDoubleFromCommandLine());
            case '-':
                return subtract(getDoubleFromCommandLine(), getDoubleFromCommandLine());
            case 'E'://exit выход из проги
                System.exit(1); //завершает прогу, если другое значение ввели
            default:
                System.out.println("Невалидное значение");
                return -1;
        }
    }
}
