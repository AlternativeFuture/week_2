package Day_8;

public class Task17 {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 1};
        int len = numbs.length - 1;
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if (numbs[i] > numbs[i + 1]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}


