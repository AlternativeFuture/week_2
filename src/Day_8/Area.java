package Day_8;

public class Area {
    public static void main(String[] args) {
        int[] seven = new int[1000];
        for (int i = 0, num = 7; i != 999; num += 7, i++) {
            seven[i] = num;
            System.out.print(seven[i]);
        }
    }
}
