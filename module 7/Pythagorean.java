import java.util.*;
import java.text.*;

class Pythagorean {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        DecimalFormat twoPlaces = new DecimalFormat("0.00");

        System.out.print("Enter A and B length: ");
        double sideA = key.nextDouble();
        double sideB = key.nextDouble();  
        
        double sideC = findC(sideA, sideB);
        
        double parimeter = findParimeter(sideA, sideB, sideC);

        System.out.println("Hypotenuse : " + twoPlaces.format(sideC) + "\nParimeter: " + twoPlaces.format(parimeter));

    }

    public static double findC(double sideA, double sideB){

        double sideC;
        sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return sideC;
    }

    public static double findParimeter(double sideA, double sideB, double sideC){
        double parimeter;
        parimeter = sideA + sideB + sideC;
        return parimeter;
    }
}