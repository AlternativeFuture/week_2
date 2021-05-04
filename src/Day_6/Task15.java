package Day_6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numbs_");
        int num = scanner.nextInt();
        int max = 0, max2 = 0;
        while (num != 0) {
            if (num > max) {
                max2 = max;
                max = num;
            }
            if (num < max && num > max2) {
                max2 = num;
            }
            System.out.print("Input numbs_");
            num = scanner.nextInt();
        }
        System.out.println(max2);
    }
}
