import java.util.*;

class Nested {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("This program generates a customized table.\nEnter how many rows the colum has: ");
        int rows = key.nextInt();

        System.out.print("Enter columns in the table: ");
        int columns = key.nextInt();

        System.out.print("Enter what number the table will start on: ");
        int start = key.nextInt();

        for(int i = 1; i <= rows; i++) {
            System.out.print("\n");
            for(int v = 1; v <= columns; v++) {
                System.out.printf("%2d ", start);
                start++;
            }
        }
    }
}