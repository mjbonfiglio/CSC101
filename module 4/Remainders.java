import java.util.*;

class Remainders {
   public static void main(String[] args) {
      Scanner key = new Scanner(System.in);
      
      System.out.print("This program takes 2 whole integers from a user and outputs if the divident is a multiple of the divisor and also outputs the remainder!\nEnter a dividend: ");
      int divident = key.nextInt();
      System.out.print("Enter a divisor: ");
      int divisor = key.nextInt();
      
      switch(divident % divisor) {
         case 0:
            System.out.println(divident + " is a multiple of " + divisor + ". the remainder is: " + divident % divisor);
            break;
         default:
            System.out.println(divident + " is not a multiple of " + divisor + ". the remainder is: " + divident % divisor);
      
      }
      
      
   }
}