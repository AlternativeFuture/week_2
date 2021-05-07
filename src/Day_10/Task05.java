package Day_10;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first_");
        int firstNum = scanner.nextInt();
        System.out.print("Input second_");
        int secondNUm = scanner.nextInt();
        for (int i = firstNum; i < secondNUm; i++) {
            if (i / 1000 == i % 10 && (i % 1000) /100 == i % 100/10) {
                System.out.println(i);
            }
        }
    }
}
