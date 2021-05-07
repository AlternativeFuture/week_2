package Day_9;

public class Task05 {
    public static void main(String[] args) {
        int[][] area = {{0, 1, 2}, {2, 5, 3}, {7, 3, 4}};
        int indexRow = 0, indexColumn = 0, maxValue = 0;
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                if (area[i][j] > maxValue) {
                    maxValue = area[i][j];
                    indexRow = i;
                    indexColumn = j;
                }
            }
        }
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                System.out.print(area[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(area[indexRow][indexColumn]);
        System.out.println(indexColumn + " " + indexRow);
    }
}



