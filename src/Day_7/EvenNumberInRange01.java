package Day_7;

import java.util.Scanner;

public class EvenNumberInRange01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        while (a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
                a += 2;
            } else {
                a++;
            }
        }
    }
}
