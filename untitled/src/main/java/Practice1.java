import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number");
        double num1 = scanner.nextDouble();
        Scanner myScannerString = new Scanner(System.in);
        System.out.println("+, -, * or /");
        String operation = myScannerString.next();
        System.out.println("Second number");
        double num2 = scanner.nextDouble();
        if ( operation.equals("+") ) {
            addition(num1, num2);
        } else if (operation.equals("-") ) {
            substraction(num1, num2);
        } else if (operation.equals("*")) {
            multiplication(num1, num2);
        } else if(operation.equals("/")) {
            divitation(num1, num2);
        } else {
            System.out.println("не выбран не один из элементов + - * or /");
        }

    }
    static void addition(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("Result is: " + sum);
    }
    static void substraction (double num1, double num2) {
        double sum = num1 - num2;
        System.out.println("Result is: " + sum);
    }
    static void multiplication(double num1, double num2) {
        double sum = num1 * num2;
        System.out.println("Result is: " + sum);
    }
    static void divitation(double num1, double num2) {
        double sum = num1 / num2;
        System.out.println("Result is: " + sum);
    }
}
