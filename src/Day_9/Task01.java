package Day_9;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] area = new int[n][n];
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                if (i + j == n-1) {
                    area[i][j] = 1;
                } else {
                    area[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                System.out.print(area[i][j] +" ");
            }
            System.out.println();
        }
    }
}
