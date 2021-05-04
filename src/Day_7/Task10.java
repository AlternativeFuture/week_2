package Day_7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        String binary = scanner.nextLine();
        int decimal = 0;
        int exponent = 0;
        for (int i = (binary.length() -1); i > -1; i--) {
            if (((int) binary.charAt(i)) == 49) {
                decimal += Math.pow(2, exponent);
            }
            exponent++;
        }
        System.out.println(decimal);
    }
}
