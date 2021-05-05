package Day_8;

public class Task16 {
    public static void main(String[] args) {
        int[] numbs = {0, 2, 3, 0, 8, 0, 8, 9, 0, 3, 5, 0};
        boolean flag = false;
        int len = numbs.length - 1;
        int count0 = 0, index0 = 0, index = 0;
        for (int i = 0; i <= len; i++) {

            if (numbs[i] == 0) {
                count0++;
                if (!flag) {
                    index0 = i;
                }
                flag = true;
            } else {
                if (flag) {
                    index = i;
                }
            }
            if (index > index0 && count0 > 0) {
                numbs[index0] = numbs[index];
                numbs[index] = 0;
                index =0;
                flag = false;
                i -= count0;
                count0 = 0;
            }
        }
        for (int i = 0; i < len + 1; i++) {
            System.out.print(numbs[i]);
        }
    }
}

