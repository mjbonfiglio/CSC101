import java.util.*;

class Loops {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("This is a counting machine. Enter what you want me to count to: ");
        int max = key.nextInt();

        for(int i = 1; i <= max; i++) {
            System.out.print(i);
        }

        System.out.print("Enter what you want me to count to: ");
        max = key.nextInt();
        int count = 1;

        while(count <= max) {
          System.out.println(count);
          count++;
        }

        System.out.print("I can also count down all the way to one, what number should I start from: ");
        max = key.nextInt();

        for(int i = max; i >= 1; i--){
            System.out.println(i);
        }

        System.out.print("Enter another number I can start from to count down: ");
        max = key.nextInt();
        count = max;

        while(count >= 1) {
            System.out.println(count);
            count--;
        }
        System.out.println("I love counting, that was fun.");

    }
}