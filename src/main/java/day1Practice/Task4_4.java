/*Задание:

        Напишите программу на Java, которая определяет, является ли введенное пользователем число "совершенным числом".

        Совершенное число - это натуральное число, которое равно сумме всех своих делителей, за исключением самого себя.

        Уровень сложности: 4 из 100

        Описание:

        Попросите пользователя ввести целое число с помощью текстового сообщения.
        Считайте введенное пользователем число и сохраните его в переменной.
        Проверьте, является ли число совершенным.
        Если число является совершенным, выведите соответствующее сообщение на экран и выведите список всех его делителей.
        Если число не является совершенным, выведите соответствующее сообщение на экран.
        Пример вывода программы:

Введите целое число: 28
Число 28 является совершенным.
Список делителей: 1, 2, 4, 7, 14

Введите целое число: 12
Число 12 не является совершенным.

        */




package day1Practice;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число");
        int number = scanner.nextInt();



        if (number == sumNumber(number)) {
            System.out.println("Число "+ number +" является совершенным.");
            System.out.print("Список делителей: ");
            numberOfNumber(number);
        } else {
            System.out.println("Число "+ number + " не является совершенным.");
        }

    }


    private static int sumNumber(int number) {
        int sumI = 0;
        for (int i = 1; i <= number -1; i++) {
            if (number % i == 0) {
            sumI = sumI + i;
            }
        }
        return sumI;
    }

    private static void numberOfNumber(int number) {
        int i;
        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            } else {
            }
        }
    }
}
