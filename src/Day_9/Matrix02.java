package Day_9;

import java.util.Random;

public class Matrix02 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Random random = new Random();
        int sum = 0;
//      region  Initialization
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (random.nextInt(89) + 10);
                if (i + j >= 9) {
                    sum += matrix[i][j];
                }
            }
        }
//        endregion
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(sum);
    }
}
