/*

Implement a simple lottery using an if-else-if construct:
        Create class for lottery
        Implement the lottery in the main() method
        Add variables for winning numbers (5 numbers)
        Add variables for user numbers
        Get 5 numbers from the user, use Scanner
        Restrict game numbers from 1 to 50
        Randomly assign winning numbers to variables
        Print to the console lottery numbers and numbers entered by the user


No. 1.
    Increase the simultaneous number of players to three.
    Three players enter numbers to play.
    The lottery is played once.
No. 2.
    **Using the JUnit library, write tests that check the methods implemented by
    in the application - Lottery and Utils class.
*/


import lottery.Lottery;

public class Main {
    public static void main(String[] args) {
        new Lottery().run();
    }
}
