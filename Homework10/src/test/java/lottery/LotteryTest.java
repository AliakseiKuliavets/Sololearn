package lottery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    Lottery lottery = new Lottery();
    @Test
    void run() {
    }
    @Test
    public void testMakeCustomerNumbers() {
       int[] customerNumbers = lottery.getMakeCustomerNumbers();
       assertEquals(5, customerNumbers.length);

       for (int number : customerNumbers) {
           assertTrue(number >= 1 && number <= 50);
       }
    }
}