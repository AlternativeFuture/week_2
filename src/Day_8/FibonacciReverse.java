package Day_8;

import java.util.Scanner;

public class FibonacciReverse {
    public static void main(String[] args) {
        int[] fiboArea = new int[1000];
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fiboArea[0] = 0;
        fiboArea[1] = 1;
        for (int i = 2; i < num; i++) {
            fiboArea[i] = fiboArea[i - 1] + fiboArea[i - 2];
        }
        for (int i = fiboArea.length - 1; i > -1; i--) {
            if (fiboArea[i] != 0) {
                System.out.println(fiboArea[i]);
            }
        }
    }
}
