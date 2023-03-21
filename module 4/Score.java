import java.util.*;

class Score {
   public static void main(String[] args) {
   
      Scanner key = new Scanner(System.in);
      
      System.out.print("Enter your credit score (a whole integer): ");
      int score = key.nextInt();
      
      if (300 <= score && score <= 579) {
         System.out.println(score + " is a bad credit score!");
      }
      else if (500 <= score && score <= 669) {
         System.out.println(score + " is a fair credit score!");
      }
      else if (670 <= score && score <= 739) {
         System.out.println(score + " is a good credit score!");
      }
      else if (740 <= score && score <= 799) {
         System.out.println(score + " is a very good credit score!");
      }
      else if (800 <= score && score <= 850) {
         System.out.println(score + " is an exceptional credit score!");
      }
      else {
         System.out.println(score + " is not a valid credit score!");
       }
   }
}