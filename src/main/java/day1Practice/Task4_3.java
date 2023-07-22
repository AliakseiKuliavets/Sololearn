/*Задание:

        Напишите программу на Java, которая определяет, является ли введенная пользователем строка анаграммой другой
        строки.

        Анаграмма - это слово или фраза, образованная путем перестановки букв другого слова или фразы, содержащих
        все те же буквы, что и исходное слово или фраза.

        Уровень сложности: 4 из 100

        Описание:

        Попросите пользователя ввести две строки с помощью текстовых сообщений.
        Считайте введенные пользователем строки и сохраните их в переменных.
        Приведите строки к нижнему регистру (или верхнему регистру) и удалите из них все пробелы.
        Проверьте, являются ли строки анаграммами друг друга.
        Если строки являются анаграммами, выведите соответствующее сообщение на экран.
        Если строки не являются анаграммами, выведите соответствующее сообщение на экран.*/



package day1Practice;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку");
        String firstString = scanner.nextLine().toLowerCase();
        System.out.print("Введите первую строку");
        String secondString = scanner.nextLine().toLowerCase();

        String firstStringSort = firstString.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        String secondStrinSort = secondString.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        if (firstStringSort.equals(secondStrinSort)) {
            System.out.println("Строки являются анаграммами");
        } else {
            System.out.println("Строки не являются анаграммами");
        }

    }
}
