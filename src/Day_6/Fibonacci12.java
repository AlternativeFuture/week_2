package Day_6;

import java.util.Scanner;

public class Fibonacci12 {
    public static void main(String[] args) {
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n1=1,n2=1,n3,count=2;
        while (n2 < num) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            count++;
        }
        if (n2 == num ) {
            System.out.println(count);
        } else System.out.println(-1);
    }
}
