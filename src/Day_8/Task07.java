package Day_8;

public class Task07 {
    public static void main(String[] args) {
        int[] numbs = {5, -4, 3, -2, 5};
        int smallest = 1001;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] > 0) {
                if (numbs[i] < smallest) {
                    smallest = numbs[i];
                }
            }
        }
        System.out.print("The smallest is " + smallest);
    }
}
