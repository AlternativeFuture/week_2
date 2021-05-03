package Day_6;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        big_loop:
        for (String num = ""; !num.equals("exit()"); ) {
            System.out.print("Input number for calculating factorial _");
            num = scanner.nextLine();
            for (int j = 0; j < num.length(); ) {
                char index = num.charAt(j);
                if (index < 58 && index > 47) {
                    j++;
                } else {
                    System.out.println("Invalid Input!");
                    continue big_loop;
                }
            }
            int numInt = Integer.parseInt(num);
            int res = 1;
            for (int  i = 1; i <= numInt;   i++) {
                res *= i;
            }
            System.out.println(numInt +"! = " + res);
        }
    }

}
