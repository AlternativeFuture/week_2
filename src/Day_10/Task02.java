package Day_10;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n_");
        int n = scanner.nextInt();
        int minute = 0, hour = 0;

            hour = n / 60;
            minute = n % 60;
            hour %= 24;
        System.out.println(hour + " " + minute);


    }
}
