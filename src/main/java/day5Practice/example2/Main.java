package day5Practice.example2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers =new int[8];
        Random random=new Random();
        for (int i = 0; i<numbers.length;i++) {

            numbers[i] = random.nextInt(1,50);

            System.out.println(numbers[i]);
        }
        }
    }

