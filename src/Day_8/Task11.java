package Day_8;

public class Task11 {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5};
        int temp;
        for (int i = 0; i < numbs.length - 1; i += 2) {
            temp = numbs[i];
            numbs[i] = numbs[i+1];
            numbs[i+1] = temp;
        }
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + " ");
        }
    }
}