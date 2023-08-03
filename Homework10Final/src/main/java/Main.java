/*
№1.

        Увеличьте одновременное количество игроков до трех.
        Три игрока вводят номера для игры.
        Лотерея играет один раз.


        №2.

        **Используя библиотеку JUnit, напишите тесты, которые проверяют методы, реализованные в приложении
        - лотерея и Utils классе.

        No. 1.

        Increase the simultaneous number of players to three.
        Three players enter numbers to play.
        The lottery is played once.


        No. 2.

        **Using the JUnit library, write tests that test the methods implemented in the application
        - Lottery and Utils class.

*/



import lottery.Lottery;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        lottery.run();
    }
}
