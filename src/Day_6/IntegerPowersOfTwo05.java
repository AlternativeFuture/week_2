package Day_6;

import java.util.Scanner;

public class IntegerPowersOfTwo05 {
    public static void main(String[] args) {
        System.out.print("Input number_");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int total = 1;
        while (total <= num) {
            System.out.println(total);
            total *= 2;
        }
//        int total = 2;
//        for (int i = 0; total <= num; i++) {
//            if (i == 0) {
//                total = 1;
//            } else if (i == 1) {
//                total = 2;
//            } else total *= 2;
//            if (total >num ) {break;}
//            System.out.println(total);
//        }
    }
}
