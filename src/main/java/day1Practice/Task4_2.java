/*Задание:

        Напишите программу на Java, которая определяет, является ли введенная пользователем строка палиндромом.

        Палиндром - это строка, которая читается одинаково слева направо и справа налево, игнорируя пробелы и регистр символов.

        Уровень сложности: 4 из 100

        Описание:

        Попросите пользователя ввести строку с помощью текстового сообщения.
        Считайте введенную пользователем строку и сохраните её в переменной.
        Приведите строку к нижнему регистру (или верхнему регистру) и удалите из неё все пробелы.
        Проверьте, является ли строка палиндромом после приведения к нижнему регистру и удаления пробелов.
        Если строка является палиндромом, выведите соответствующее сообщение на экран.
        Если строка не является палиндромом, выведите соответствующее сообщение на экран.*/


package day1Practice;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку");
        String myString = scanner.nextLine().toLowerCase().replaceAll(" ", "");

        String myStringRevers = new StringBuilder(myString).reverse().toString().replaceAll(" ", "");
        if (myString.equals(myStringRevers)) {
            System.out.println("Строка является палиндромом.");
        }else  {
            System.out.println("Строка не является палиндромом.");
        }
        System.out.println(myString);
        System.out.println(myStringRevers);
    }
}
