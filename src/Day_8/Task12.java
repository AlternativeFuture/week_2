package Day_8;

public class Task12 {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5, 6};
        int temp =0;
        int len= numbs.length-1;
        for (int i = 0; 0 < len; len --) {
            if (i == 0) {
                temp = numbs[len];
                i++;
            }
            numbs[len] = numbs[len -1];
        }
        numbs[0] = temp;
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i]);
        }
    }
}