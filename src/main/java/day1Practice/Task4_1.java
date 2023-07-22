/*Задание:

        Напишите программу на Java, которая определяет, является ли введенное пользователем число палиндромом.

        Палиндром - это число, которое читается одинаково слева направо и справа налево.

        Уровень сложности: 4 из 100

        Описание:

        Попросите пользователя ввести целое число с помощью текстового сообщения.
        Считайте введенное пользователем число и сохраните его в переменной.
        Проверьте, является ли число палиндромом.
        Если число является палиндромом, выведите соответствующее сообщение на экран.
        Если число не является палиндромом, выведите соответствующее сообщение на экран.*/

package day1Practice;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число");
        int number = scanner.nextInt();

        String number1 = String.valueOf(number);
        String number1Revers = new StringBuilder(number1).reverse().toString();

        if (number1.equals(number1Revers)) {
            System.out.println("Число является палиндромом.");
        } else {
            System.out.println("Число не является палиндромом.");
        }
    }
}
