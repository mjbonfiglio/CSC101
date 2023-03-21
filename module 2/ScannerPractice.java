import java.util.*;

class ScannerPractice {
   public static void main( String[] args){
   
      Scanner k = new Scanner(System.in); //declaring scanner object
      
      System.out.println("Enter text to store into a string: ");
      String str = k.nextLine();
      
      System.out.println("Enter an integer to store into an int: ");
      int integ = k.nextInt();
      
      System.out.println("Enter a real number to store into a double: ");
      double doub = k.nextDouble();
      
      System.out.println("Your String: " + str + "\n" + "Your Integer: " + integ + "\n" + "Your Double: " + doub);
      
   }
}