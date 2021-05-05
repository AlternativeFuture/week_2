package Day_8;

public class Task06 {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 2, 1};
        int var = 0, index = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] > var) {
                var = numbs[i];
                index =i;
            }
        }
        System.out.print("The largest is " + numbs[index] + " index is " + index);
    }
}
