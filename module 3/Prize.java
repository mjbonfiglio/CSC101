import java.util.*;

class Prize{
   public static void main(String[] args) {
   
      Scanner k = new Scanner(System.in);
      
      System.out.print("Enter the First prize: ");
      String firstPrize = k.nextLine();
      
      System.out.print("Enter upper bounds for tickets: ");
      int upperBound1 = k.nextInt();
      
      System.out.print("Enter lower bounds for tickets: ");
      int lowerBound1 = k.nextInt();
      
      System.out.print("Enter the second prize: ");
      String secondPrize = k.nextLine();
      k.nextLine();
      
      System.out.print("Enter upper bounds for tickets: ");
      int upperBound2 = k.nextInt();
      
      System.out.print("Enter lower bounds for tickets: ");
      int lowerBound2 = k.nextInt();

      
      Random r = new Random();
      int winner1 = r.nextInt(lowerBound1, upperBound1);
      
      int winner2 = r.nextInt(lowerBound2, upperBound2);
      
      System.out.println("The winner of the " + firstPrize + " is ticket number: " + winner1);
      System.out.println("The winner of the " + secondPrize + " is ticket number: " + winner2);
      
   }
}