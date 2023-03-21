import java.util.*;

class lab9Part2{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter lower bound for table: ");
        int lower = key.nextInt();

        System.out.print("Enter Upper bound for table: ");
        int upper = key.nextInt();

        int size = 1 + (upper - lower);
        System.out.println("Size " + size);

        int[][] multiTable = new int[size][size];

        for(int i = 0; i < size; i++){
            System.out.println("\n");
            for(int e = 0; e < size; e++){
                multiTable[i][e] = (lower + i) * (lower + e);
                System.out.printf("%6d", multiTable[i][e]);
            }
        }
    }
}