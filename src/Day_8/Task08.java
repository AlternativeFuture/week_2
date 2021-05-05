package Day_8;

public class Task08 {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8};
        int count = 1;
        for (int i = 0; i < numbs.length - 1; i++) {
            if (numbs[i] != numbs[i + 1]) {
                count++;
            }
        }
        System.out.print(count);
    }
}

