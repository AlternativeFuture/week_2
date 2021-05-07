package Day_10;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int two = 2, twoN = 1;
        for (int i = 0; i < n; i++) {
            twoN  *= two;
        }
        System.out.println(twoN);
    }
}
