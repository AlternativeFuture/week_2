package Day_8;

public class Task10 {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5, 6};
        int temp, n = numbs.length - 1;
        for (int i = 0; i < numbs.length / 2; i++) {
            temp = numbs[i];
            numbs[i] = numbs[n - i];
            numbs[n - i] = temp;
        }
        for (int i = 0; i < numbs.length; i++) {
            System.out.println(numbs[i]);
        }
    }
}