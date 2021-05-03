package Day_6;

import java.util.Scanner;

public class NaturalNumberTillN08 {
    public static void main(String[] args) {
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int total = 1;
        int i = 1;
        int num = scanner.nextInt();
        first:
        while (total != num) {
            int exponent = 0;
            while (total <= num) {
                if (total == num) {
                    System.out.println("exponent=" + exponent);
                    System.out.println("Tries=" + i);
                    break first;
                } else {
                    exponent++;
                    total *= 2;
                }
            }
            System.out.print("Input number_");
            num = scanner.nextInt();
            total = 1;
            i++;
        }
    }
}

