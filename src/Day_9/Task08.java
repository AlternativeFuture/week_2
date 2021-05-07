package Day_9;

public class Task08 {
    public static void main(String[] args) {
        int[][] area = {{0, 1, 2}, {2, 1, 7}, {7, 3, 6}};
        int[][] area2 = {{0, 1, 2}, {2, 1, 7}, {7, 3, 6}};
        int[][] areaSum= new int[3][3];
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                areaSum[i][j] = area[i][j] +area2[i][j];
            }
        }
        for (int i = 0; i < areaSum.length; i++) {
            for (int j = 0; j < areaSum.length; j++) {
                System.out.print(areaSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
