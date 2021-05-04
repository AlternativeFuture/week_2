package Day_7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;
        System.out.print("Input N_");
        for (int n = scanner.nextInt(); n > 0; n--) {
            System.out.print("Input number_");
            int num = scanner.nextInt();
            if (num == 0) {
                zero++;
            } else if (num > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("Zero = " + zero);
        System.out.println("Positive = " + positive);
        System.out.println("Negative = "+ negative);
    }
}
