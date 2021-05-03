package Day_6;

import java.util.Scanner;

public class IntegersInDescending06 {
    public static void main(String[] args) {
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (;num >=0 ; num --) {
            System.out.println(num);
        }
    }
}
