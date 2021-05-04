package Day_6;

import java.util.Scanner;

public class BankPercent14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x_");
        double x = scanner.nextDouble();
        System.out.print("Input p_");
        double p = scanner.nextDouble();
        System.out.print("Input y_");
        int y = scanner.nextInt();
        int i = 0;
        while (x < y) {
            x += (x * p / 100);
            i++;
        }
        System.out.println(i);
    }
}
