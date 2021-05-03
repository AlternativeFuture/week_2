package Day_6;

import java.util.Scanner;

public class SmallestIntegerK09 {
    public static void main(String[] args) {
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int total = 1;
        int num = scanner.nextInt();
        int exponent = 0;
        while (total < num) {
                exponent++;
                total *= 2;
            }
        System.out.println(exponent);
        }
    }


