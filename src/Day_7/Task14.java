package Day_7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input N_");
        int n = scanner.nextInt();
        int a = 0;
        for (int i = n; n != a; a++) {
            System.out.println();
            if (a % 2 != 0) {
                System.out.print(" ");
            }
            for (int j = 0; i != j; j++) {
                System.out.print("#");
            }
        }
    }
}

