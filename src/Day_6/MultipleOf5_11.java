package Day_6;

import java.util.Scanner;

public class MultipleOf5_11 {
    public static void main(String[] args) {
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (n != x) {
            if (x % 3 != 0) {
                System.out.println(x);
            }
            x++;
        }
    }
}
