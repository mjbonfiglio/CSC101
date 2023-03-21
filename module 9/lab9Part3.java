import java.util.*;

class lab9Part3{
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = key.nextInt();

        String input;
        System.out.print("Enter letter: ");
        input = key.next();
        char letter = input.charAt(0);
        
        char[][] pyramid = new char[rows][];

        for(int i = 0; i < pyramid.length; i++){
            pyramid[i] = new char[i + 1];
        }

        for(int i = 0; i < pyramid.length; i++){
            System.out.print("\n");
            for(int e = 0; e < pyramid[i].length; e++){
                pyramid[i][e] = letter;
                System.out.print(pyramid[i][e]);
            }
        }
    }
}