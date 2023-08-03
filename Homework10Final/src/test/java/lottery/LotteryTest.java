package lottery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void run() {
    }

    @Test
    public void testMakeCustomerNumbers() {
        Lottery lottery = new Lottery();

        int[] customerNumbers = lottery.getMakeCustomerNumbers();

        assertEquals(5, customerNumbers.length);

    }
}