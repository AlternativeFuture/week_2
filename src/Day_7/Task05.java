package Day_7;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        int num = scanner.nextInt();
        int reverse = 0;
        while (num != 0) {
            reverse *= 10;
            reverse += (num % 10);
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
