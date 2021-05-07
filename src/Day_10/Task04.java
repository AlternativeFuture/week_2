package Day_10;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n_");
        int n = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number isn`t prime");
        }
    }
}
