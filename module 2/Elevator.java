import java.util.*;

class Elevator {
   public static void main(String[] args){
   
      Scanner k = new Scanner(System.in);
      
      System.out.println("Enter elevator weight limit: ");
      double weightLimit = k.nextDouble();
      
      System.out.println("Enter weight of one refrigerator: ");
      double fridgeWeight = k.nextDouble();
      
      double maxFridge = weightLimit / fridgeWeight;
      int intMax = (int)maxFridge;
      double totalWeight = fridgeWeight * intMax;
      
      System.out.println("The elevator can hold: " + intMax + " Fridge(s) at once.");
      System.out.println("This will weigh: " + totalWeight + " pounds.");
      System.out.println("After loading the fridges on, you will have an excess of: " + (weightLimit - totalWeight) + " Pounds.");
   }
}