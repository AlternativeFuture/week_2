package Day_7;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        int num = scanner.nextInt();
        int x = 1;
        while (x <= num) {
            if (num % x == 0) {
                System.out.println(x);
            }
            x++;
        }
    }
}
