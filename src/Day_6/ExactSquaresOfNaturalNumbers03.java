package Day_6;

import java.util.Scanner;

public class ExactSquaresOfNaturalNumbers03 {
    public static void main(String[] args) {
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i*i <= num; i ++) {
            System.out.println(i* i);
        }
    }
}
