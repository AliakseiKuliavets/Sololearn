package day5Practice.example2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int[] arrays = {12,13,43,656,89,36,99,46,9876,4,5,7,7};
        for (int i = 1; i < arrays.length; i = i + 2 ) {
            arrays[i] = 0;
        }
        System.out.println(Arrays.toString(arrays));
    }
}

