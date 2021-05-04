package Day_6;

import java.util.Scanner;

public class SumOfDigits17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        int digit = scanner.nextInt();
        int sum =0;
        while (digit > 0) {
            sum += digit % 10;
            digit /= 10;
        }
        System.out.println(sum);
    }
}
