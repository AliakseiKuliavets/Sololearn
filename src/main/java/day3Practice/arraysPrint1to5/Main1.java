package day3Practice.arraysPrint1to5;

public class Main1 {
    public static void main(String[] args) {

        PrivatArrays1 privatArrays = new PrivatArrays1();

        for (int i : privatArrays.getArraysInt()) {
            System.out.print(i + " ");
        }

    }
}
