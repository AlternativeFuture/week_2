package Day_8;

public class Task15 {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8};
        int len = numbs.length - 1;
        for (int i = 0; i <= len; i++) {
            int count = 0;
            for (int j = 0; j <= len; j++) {
                if (i != j) {
                    if (numbs[i] == numbs[j]) {
                        break;
                    } else {
                        count++;
                    }
                }
            }
            if (len  == count) {
                System.out.println(numbs[i]);
            }
        }
    }
}

