//Matthew Bonfiglio
//A program that asks for the cost of a purchase and the money given, and calculates the correct amount of change due to the user

import java.util.*;
import java.text.*;

class ChangeMB{
   public static void main(String[] args){
   
      int count = 5;

if(count == 5){

     System.out.println("It's 5!");

} else (count < 5){

     System.out.println("Less than 5!");

}
      
      Scanner key = new Scanner(System.in);                 //scanner and decimal formats
      DecimalFormat twoPlaces = new DecimalFormat("0.00");
      DecimalFormat zeroPlaces = new DecimalFormat("0");
      
      final int oneHundred = 100;      //consts for each bill and coin type
      final int fifty = 50;
      final int twenty = 20;
      final int ten = 10;
      final int five = 5;
      final int one = 1;
      final double quarter = .25;
      final double dime = .10;
      final double nickel = .05;
      final double penny = .01;
      
      System.out.print("Enter cost of purchase: $");     //prompt user for amount owed and paid
      double cost = key.nextDouble();
      
      System.out.print("Enter amount paid: $");
      double paid = key.nextDouble();
      
      double change = paid - cost;
      
      System.out.println("Total amount due: $" + twoPlaces.format(cost) + "\nTotal amount paid: $" + twoPlaces.format(paid) + "\nTotal change due: $" + twoPlaces.format(change));     //displayed input information
      
      double hundreds = Math.floor(change / oneHundred);    //calculate total amount of each bill paid
      change -= (oneHundred * hundreds);
      double fifties = Math.floor(change / fifty);
      change -= (fifty * fifties);
      double twenties = Math.floor(change / twenty);
      change -= (twenty * twenties);
      double tens = Math.floor(change / ten);
      change -= (tens * ten);
      double fives = Math.floor(change / five);
      change -= (fives * five);
      double ones = Math.floor(change / one);
      change -= (ones * one);
      double quarters = Math.floor(change / quarter);
      change -= (quarters * quarter);
      double dimes = Math.floor(change / dime);
      change -= (dimes * dime);
      double nickels = Math.floor(change / nickel);
      change -= (nickels * nickel);
      double pennies = Math.round(change / penny);
       
      System.out.println("<---------------------------------------------->");    //outputting information 
      System.out.println("Hundreds: " + zeroPlaces.format(hundreds));
      System.out.println("Fifties: " + zeroPlaces.format(fifties));
      System.out.println("Twenties: " + zeroPlaces.format(twenties));
      System.out.println("Tens: " + zeroPlaces.format(tens));
      System.out.println("Fives: " + zeroPlaces.format(fives));
      System.out.println("Ones: " + zeroPlaces.format(ones));
      System.out.println("Quarters: " + zeroPlaces.format(quarters));
      System.out.println("Dimes: " + zeroPlaces.format(dimes));
      System.out.println("Nickels: " + zeroPlaces.format(nickels));
      System.out.println("Pennies: " + zeroPlaces.format(pennies));
      System.out.println("<---------------------------------------------->");
      System.out.println("GoodBye");

      
      
   }
}