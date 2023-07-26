package day4Practice.Arrays1_2;

public class PrivateArraysNum {
    private int[] myInt = {1,2,9,12,67,34};

    private int maxElemOfArray() {
        int max = myInt[0];
        for (int i = 1; i < myInt.length; i++) {
            if (max < myInt[i]) {
                max = myInt[i];
            }
        }
                return max;
    }
    public int getMaxElemOfArray() {
        return maxElemOfArray();
    }
}
