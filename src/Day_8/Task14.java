package Day_8;

public class Task14 {
    public static void main(String[] args) {
        int[] numbs = {3, 2, 1, 4, 5};
        int len = numbs.length - 1;
        for (int i = 2; i < len; i++) {
            numbs[i]= numbs[i+1];
        }
        for (int i = 0; i < len; i++) {
            System.out.print(numbs[i]);
        }
    }
}