/*Write a Java program that finds the smallest and largest elements in an array and displays them on the screen.*/


package day3Practice.arraysPrint3;

public class Main3 {
    public static void main(String[] args) {
        PrivateArrays3 privateArrays3 = new PrivateArrays3();
        privateArrays3.getFindHighVal();
        System.out.println("Smallest element: " + privateArrays3.getFindMinVal());
        System.out.println("Largest element: " + privateArrays3.getFindHighVal());
    }
}
