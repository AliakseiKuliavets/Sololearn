package day4Practice.Arrays1_1;

public class PrivateArrays1_1 {
    private int[] myInt = {1,2,6,9,12};

    private int sumAllMyInt() {
        int sum =0;
        for (int i: myInt) {
            sum = sum +i;
        }
        return sum;
    }

    public int getSumAllMyInt() {
        return sumAllMyInt();
    }

}
