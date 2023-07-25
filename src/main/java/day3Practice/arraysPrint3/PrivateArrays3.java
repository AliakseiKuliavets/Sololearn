package day3Practice.arraysPrint3;

public class PrivateArrays3 {
    private int[] myArrays = {1, 4, 9, 12, 45, 23, 1, 99};

    private int findHighVal() {
        int max = myArrays[0];
        for (int i : myArrays) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private int findMinVal() {
        int min = myArrays[0];
        for (int i : myArrays) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int getFindHighVal() {
        return findHighVal();
    }

    public int getFindMinVal() {
        return findMinVal();
    }
}

