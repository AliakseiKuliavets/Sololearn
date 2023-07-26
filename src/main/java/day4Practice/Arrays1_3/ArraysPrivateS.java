package day4Practice.Arrays1_3;

public class ArraysPrivateS {
    private int[] myArraysInt = {1, 5, 9, 12, 43, 76, 4, 3};

    private int target;

    public void setTarget(int target) {
        this.target = target;
    }

    private int searchIndexNum() {
        for (int i = 0; i < myArraysInt.length; i++) {
            if (myArraysInt[i] == this.target) {
                return i;
            }
        }
        return -1;
    }

    public int getSearchIndexNum() {
        return searchIndexNum();
    }
}

