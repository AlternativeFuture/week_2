package Day_9;

public class Task06 {
    public static void main(String[] args) {
        int[][] area = {{0, 1, 2}, {2, 1, 7}, {7, 3, 6}};
        int maxSum1 = 0, maxSum2 = 0, sumIndex = 0, indexColumn = 0, indexColumnDuplicate = 0, maxValue = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                if (area[i][j] > maxValue) {
                    maxValue = area[i][j];
                    indexColumn = j;
                } else if (maxValue == area[i][j]) {
                    flag = false;
                    indexColumnDuplicate = j;
                }
            }
        }
        if (!flag) {
            for (int i = 0; i < area.length; i++) {
                maxSum1 += area[i][indexColumn];
            }
            for (int i = 0; i < area.length; i++) {
                maxSum2 += area[i][indexColumnDuplicate];
            }
        }
        if (maxSum2 > maxSum1) {
            System.out.println("value=" + maxValue + " line=" + indexColumnDuplicate);
        } else {
            System.out.println("value=" + maxValue + " line=" + indexColumn);

        }
    }
}



