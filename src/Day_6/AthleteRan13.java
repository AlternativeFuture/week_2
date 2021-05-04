package Day_6;

import java.util.Scanner;

public class AthleteRan13 {
    public static void main(String[] args) {
        System.out.print("Input x_");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.print("Input y_");
        int y = scanner.nextInt();
        int i = 1;
        while (x < y) {
            x += (x * 10 / 100);
            i++;
        }
        System.out.println(i);
    }
}
