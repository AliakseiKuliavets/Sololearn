package day3Practice.arraysPrint2to5;

public class PrivatArrays {
    private int[] arraysInt = {1, 5, 7, 3, 4};

    public int[] getArraysInt() {
        return arraysInt;
    }

    private int sumArrays() {
        int sum = 0;
        for (int i : arraysInt) {
            sum += i;
        }
        return sum;
    }

    public int getArraysIntSum() {
        return sumArrays();
    }
}
