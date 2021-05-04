package Day_7;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input b_");
        int b = scanner.nextInt();
        System.out.print("Input a_");
        int a = scanner.nextInt();
        int count = 0;
        for (;b !=0 ;b = b/10) {
            if (b % 10 == a) {
                count++;
            }
        }
        System.out.println(count);
    }
}
