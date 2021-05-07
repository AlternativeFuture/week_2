package Day_9;

public class Task04 {
    public static void main(String[] args) {
        int[][] area = {{0, 1, 2}, {2, 5, 3}, {7, 3, 4}};
        int index = 0, sumRow = 0, maxSum = 0;
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                sumRow += area[i][j];
            }
            if (maxSum < sumRow) {
                index = i;
                maxSum = sumRow;
            }
            sumRow = 0;
        }
        System.out.println("Max is " + maxSum + " line is "+ index);
    }
}



