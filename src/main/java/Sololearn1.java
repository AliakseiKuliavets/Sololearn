import java.util.Scanner;

public class Sololearn1 {
    public static void main(String[] args) {
                int priceProduct = 5;
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();

                if (num % 4 == 0) {
                    System.out.println(50);
                } else if (num == 3) {
                    System.out.println(67);
                }else {
                    float result1 = num / 4;
                    float result = result1 * 0.5f;
                    System.out.println(result);
                }
            }
        }

