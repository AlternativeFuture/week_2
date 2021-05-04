package Day_7;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        int num = scanner.nextInt();
        int x = 2;
        while (num != x) {
            if (num % x == 0) {
                break;
            } else {
                x++;
            }
        }
        System.out.println(x);
    }
}
