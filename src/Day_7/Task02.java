package Day_7;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        System.out.print("Input c_");
        int c = scanner.nextInt();
        System.out.print("Input d_");
        int d = scanner.nextInt();
        for(;a <=b; a++) {
           if (a % d ==c) {
               System.out.println(a);
           }
        }
    }
}
