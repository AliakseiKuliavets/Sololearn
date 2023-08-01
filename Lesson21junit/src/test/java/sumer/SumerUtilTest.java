package sumer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumerUtilTest {

    @Test
    void shouldWorkCorrectlyWhenSumTwoNumber() {
        int first = 19;
        int second = 11;
        int result = SumerUtil.sum(first,second);

        assertEquals(30,result);
    }
    @Test
    void shouldSumNegativeNumbers() {
        int first = -14;
        int second = -1;
        int result = SumerUtil.sum(first,second);
        assertEquals(-15,result);
    }

}