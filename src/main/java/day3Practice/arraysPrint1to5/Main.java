package day3Practice.arraysPrint1to5;

public class Main {
    public static void main(String[] args) {

        PrivatArrays privatArrays = new PrivatArrays();

        for (int i : privatArrays.getArraysInt()) {
            System.out.print(i + " ");
        }

    }
}
