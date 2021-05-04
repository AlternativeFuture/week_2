package Day_6;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNUmber16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Input numbs_");
        int num = scanner.nextInt();
        int randInt = random.nextInt(100);
        while (num != randInt) {
            if (num > randInt) {
                System.out.println("Your number is greater then random number");
            } else if (num < randInt) {
                System.out.println("Your number is smaller then random number");
            }

            System.out.print("Input numbs_");
            num = scanner.nextInt();
        }
        System.out.println("The random number is "+randInt);
    }
}


