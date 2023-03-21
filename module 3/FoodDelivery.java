import java.util.*;
import java.text.*;

class FoodDelivery{
   public static void main(String[] args){
   
      Scanner k = new Scanner(System.in);
      
      final double SERVICE_CHARGE = 3.99;
      final double DELIVERY_FEE = .25;
      final double SALES_TAX = .08875;
      
      DecimalFormat twoPlaces = new DecimalFormat("0.00");
      
      System.out.print("Enter total cost of the order: ");
      double cost = k.nextDouble();
      
      System.out.print("Enter total tip in decimal form: ");
      double tip = k.nextDouble();  
      
      System.out.print("Enter total number of people eating: ");
      int people = k.nextInt();
      
      //(F+ SC) + DF(F+ SC) + ST(F + SC + DF) + T(F + SC + DF + ST)
      double salesCost = cost + SERVICE_CHARGE;
      double deliveryCost = salesCost + (salesCost * DELIVERY_FEE);
      double salesTaxCost = deliveryCost + (SALES_TAX * deliveryCost);
      double tipCost = salesTaxCost + (tip * salesTaxCost);
      
          
       System.out.println("---------------------------------------");
      
       System.out.println("Total cost of meal: $" + twoPlaces.format(cost));
       System.out.println("Service fee: $" + twoPlaces.format(SERVICE_CHARGE));
       System.out.println("Subtotal for cost and service fee: $" + twoPlaces.format(salesCost));
       System.out.println("delivery fee: 25%");
       System.out.println("Subtotal with delivery fee and service fee: $" + twoPlaces.format(deliveryCost));
       System.out.println("Sales tax: 8.875%");
       System.out.println("Subtotal with sales tax: $" + twoPlaces.format(salesTaxCost));
       System.out.println("Percentage tipped: " + tip * 100 + "%, Total tip amount: $" + twoPlaces.format(tipCost));
       System.out.println("Total cost: $" + twoPlaces.format(tipCost));
       System.out.print("In total, each person would need to pay: $" + twoPlaces.format(tipCost / people));
   
   }
}