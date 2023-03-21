import java.util.*;

class M4 {
   public static void main(String[] args) {
      boolean statement = true;
      if (statement && 1 == 1) {
         System.out.println("Hello!");
         }
      else {
         System.out.println("You will never see me!");
      }    
      int a = 1;
      int b = 2;
      if (a == 10 || b == 2) {
         System.out.println("Hello!");
      }
      
      //common issues
      //dont use multiple if statements if its not appropriate
      String str = "Hello";
      String str2 = "Hello";
      
      if (str.equals(str2)) {
         System.out.println("Hello!");
      }
   }
} 
