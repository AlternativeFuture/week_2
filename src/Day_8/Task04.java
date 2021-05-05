package Day_8;

public class Task04 {
    public static void main(String[] args) {
        int[] numbs = {1, 5, 2, 4, 3};
        for (int i = 0; i + 1 < numbs.length; i++) {
            if (numbs[i]  > numbs[i+1] ) {
                System.out.println(numbs[i]);
            }
        }
    }
}
