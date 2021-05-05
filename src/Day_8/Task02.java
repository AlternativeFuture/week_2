package Day_8;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int qty = scanner.nextInt();
        int[] numbs = new int[qty];
        for (int num = 1; num != qty+1; num++) {
            numbs[num - 1] = num;
        }
        for (int i = 0; i < qty; i++) {
            if (numbs[i] % 2 == 0) {
                System.out.println(numbs[i]);
            }
        }
    }
}
