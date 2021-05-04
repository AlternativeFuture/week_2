package Day_7;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        int num = scanner.nextInt();
        int x = 1;
        int count =0;
        while (x <= num) {
            if (num % x == 0) {
                count++;
            }
            x++;
        }
        System.out.println(count);
    }
}
