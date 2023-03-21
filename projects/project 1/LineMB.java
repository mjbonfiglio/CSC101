//Matthew Bonfiglio
//This program calculates the distance, midpoints, and slope of a line between 2 points input by a user

import java.util.*;
import java.text.*;

class LineMB{
   public static void main(String[] args){
   
      Scanner key = new Scanner(System.in);
      
      DecimalFormat twoPlaces = new DecimalFormat("0.00");
      
      System.out.println("Welcome, this program takes 2 points on a graph and finds the distance between them, the midpoint, and the slope of the line.");
      System.out.print("Please enter your x and y values of the first point, either integers or doubles, separated by any white space: "); //input x1 and y1
      double xValue1 = key.nextDouble();
      double yValue1 = key.nextDouble();
      System.out.print("Please enter your x and y values of the second point point, either integers or doubles, separated by any white space: ");   //input x2 and y2
      double xValue2 = key.nextDouble();
      double yValue2 = key.nextDouble();
      
      System.out.println("(x1, y1) = (" + twoPlaces.format(xValue1) + ", " + twoPlaces.format(yValue1) + ")"); //displaying inputs
      System.out.println("(x2, y1) = (" + twoPlaces.format(xValue2) + ", " + twoPlaces.format(yValue2) + ")");
      
      double distance = Math.sqrt(Math.pow((xValue2 - xValue1), 2) + Math.pow((yValue2 - yValue1), 2));  //calculate distance between points
      System.out.println("Distance = " + twoPlaces.format(distance));
      
      double midpointX = (xValue1 + xValue2) / 2;
      double midpointY = (yValue1 + yValue2) / 2;
      System.out.println("Midpoint = (" + twoPlaces.format(midpointX) + ", " + twoPlaces.format(midpointY) + ")");   //calculate midpoint between points
      
      double slope = (yValue2 - yValue1) / (xValue2 - xValue1);   //calculate slope
      System.out.println("Slope = " + twoPlaces.format(slope));
      
      System.out.println("Goodbye.");
      
      
       
      
      
      
      
      
   }
}