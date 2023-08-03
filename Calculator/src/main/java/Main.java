
/*


Продолжаем работу над калькулятором.
        Обновите "Калькулятор" до версии 2,
        Обновите функционал до производящего вычисления (+, -, *, /) с произвольным количеством чисел c
        дробной частью.
        Количество аргументов пользователь вводит с клавиатуры. Оно должно быть от 2 и более.
        Тип данных вводимых аргументов должен быть Double.
        Далее пользователь последовательно вводит значение каждого из аргументов, а затем - знак математической
        операции, которую необходимо выполнить со значениями введенных аргументов.
        Результат работы программы необходимо вывести в виде вычисляемого выражения и полученного результата
        с точностью до двух чисел после запятой.]





        We continue to work on the calculator.
        Update "Calculator" to version 2,
        Update the functional to a generating calculation (+, -, *, /) with an arbitrary number of numbers c
        fractional part.
        The number of arguments the user enters from the keyboard. It must be 2 or more.
        The data type of the input arguments must be Double.
        Next, the user sequentially enters the value of each of the arguments, and then - the sign of the mathematical
        the operation to be performed on the values ​​of the supplied arguments.
        The result of the program must be displayed in the form of a calculated expression and the result
        up to two decimal places.]

*/



import Calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        new Calculator().run();//вызвали стразу конструктор и метод
    }
}
