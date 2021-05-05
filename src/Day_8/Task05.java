package Day_8;

public class Task05 {
    public static void main(String[] args) {
        int[] numbs = {-1, -2, 3, -1, -2};
        for (int i = 0; i + 1 < numbs.length; i++) {
            if ((numbs[i] > 0 && numbs[i + 1] > 0) || (numbs[i] < 0 && numbs[i + 1] < 0)) {
                System.out.print(numbs[i] + " " + numbs[i + 1]);
                break;
            }
        }
    }
}
