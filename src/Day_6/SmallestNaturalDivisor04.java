package Day_6;

import java.util.Scanner;

public class SmallestNaturalDivisor04 {
    public static void main(String[] args) {
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 3; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
