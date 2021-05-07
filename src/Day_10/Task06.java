package Day_10;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string_");
        String str = scanner.nextLine();
        char firstLetter = str.charAt(0);
        int intAsci = (int) firstLetter;

        if (intAsci >= 97 && intAsci <= 122) {
            intAsci -= 32;
        }
        firstLetter = (char) intAsci;
        System.out.print(firstLetter);
        for (int i = 1; i < str.length(); i++) {
            char letter = str.charAt(i);
            int asci = (int) letter;
            if (asci >= 65 && asci <= 90) {
                asci += 32;
            }
            letter = (char) asci;
            System.out.print(letter);
        }


    }
}
