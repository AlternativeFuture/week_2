package Day_6;

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (String hotKey = ""; !hotKey.equals("3"); ) {
            System.out.println("--------MENU--------");
            System.out.println("Press 1 for perimeter");
            System.out.println("Press 2 for area");
            System.out.println("Press 3 to exit");
            hotKey = scanner.next();
            if (hotKey.equals("1")) {
                System.out.println("Perimeter=" + (2 * Math.PI * 5));
            } else if (hotKey.equals("2")) {
                System.out.println("Area = " + (Math.PI * Math.pow(5, 2)));
            }
        }

    }

}

