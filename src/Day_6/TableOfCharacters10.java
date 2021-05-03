package Day_6;

public class TableOfCharacters10 {
    public static void main(String[] args) {
        char myChar = 35;
        int i = 1;
        while (myChar <= 122) {
            if (i == 11) {
                System.out.println();
                i = 1;
            }
            System.out.print(myChar);
            myChar ++;
            i ++;
        }
    }
}
