/*Задание:

        Напишите программу на Java, которая определяет, является ли введенное пользователем число простым или составным.

        Уровень сложности: 4 из 100

        Описание:

        Попросите пользователя ввести целое число с помощью текстового сообщения.
        Считайте введенное пользователем число и сохраните его в переменной.
        Проверьте, является ли число простым или составным.
        Если число меньше или равно 1, выведите сообщение о некорректном вводе, так как простые
             числа определены как натуральные числа больше 1.
        Если число больше 1, определите, есть ли у числа делители, помимо 1 и самого числа.
        Если у числа есть делители, выведите на экран сообщение, что число является составным.
        Если у числа нет делителей, выведите на экран сообщение, что число является простым.
        */


package day1Practice;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число");
        int number;

        while (true){
            number = scanner.nextInt();
            if (number <= 1 || number > 100)
                System.out.print("Enter the valid value: ");
            else break;
        }
        boolean isComprosive = false;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isComprosive = true;
                break;
            }
        }

        if (isComprosive) {
            System.out.println("Число является составным");
        } else {
            System.out.println("Число является простым");
        }


    }
}
