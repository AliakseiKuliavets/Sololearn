/*Напишите программу на Java, которая запрашивает у пользователя два числа и выводит на экран их сумму.

        Уровень сложности: 1 из 100

        Описание:

        Попросите пользователя ввести первое число с помощью текстового сообщения.
        Считайте введенное пользователем число и сохраните его в переменной.
        Попросите пользователя ввести второе число с помощью текстового сообщения.
        Считайте введенное пользователем второе число и сохраните его в переменной.
        Произведите сложение двух чисел и сохраните результат в третьей переменной.
        Выведите на экран сумму, предварительно подготовив понятное текстовое сообщение для пользователя.
        Пример вывода программы:*/


package day1Practice;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println("Сумма чисел равна: " + (num1 + num2));
    }
}
