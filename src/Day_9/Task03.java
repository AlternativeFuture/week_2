package Day_9;

public class Task03 {
    public static void main(String[] args) {
        int[][] area = {{0, 1, 2}, {2, 5, 3}, {2, 3, 4}};
        boolean flag = true;
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                if (area[i][j] != area[j][i]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}

