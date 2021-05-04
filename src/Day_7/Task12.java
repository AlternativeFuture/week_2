package Day_7;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 1; num != count; i++) {
            for (int j = i; j != 0; j--) {
                if (count == num) {
                    break;
                }
                System.out.println(i);
                count++;
            }
        }
    }
}
