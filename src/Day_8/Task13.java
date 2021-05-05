package Day_8;

public class Task13 {
    public static void main(String[] args) {
        int[] numbs = {3, 2, 1, 4, 5};
        int max = 0, min = Integer.MAX_VALUE, minIndex = 0, maxIndex = 0;
        int len = numbs.length - 1;
        for (int i = 0; i <= len; i++) {
            if (numbs[i] > max) {
                max = numbs[i];
                maxIndex = i;
            }
            if (numbs[i] < min) {
                min = numbs[i];
                minIndex = i;
            }
        }
        numbs[minIndex] = max;
        numbs[maxIndex] = min;
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i]);
        }
    }
}