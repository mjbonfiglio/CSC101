import java.util.*;
import java.text.*;

class Newton{
   public static void main(String[] args){
   
      Scanner k = new Scanner(System.in);
      DecimalFormat sciNote = new DecimalFormat("0.000E0");

      
      final double GRAVITY = 6.674E-11;
   
      System.out.print("Enter The mass of the first object in kilograms: ");
      double mass1 = k.nextDouble();
      
      System.out.print("Enter the mass of the second object in kilograms: ");
      double mass2 = k.nextDouble();
      
      System.out.print("Enter the Distance between the 2 objects: ");
      double distance = k.nextDouble();
      
      double force = GRAVITY * ((mass1 * mass2) / Math.pow(distance, 2));
      System.out.println("Total force: " + sciNote.format(force));
      
      
   }
}