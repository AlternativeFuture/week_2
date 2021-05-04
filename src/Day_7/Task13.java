package Day_7;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input N_");
        int n = scanner.nextInt();
        for (int i = n; n != 0; n--) {
            System.out.println();
            for (int j = 0; i != j ; j ++) {
                System.out.print("*");
            }
        }
    }
}

