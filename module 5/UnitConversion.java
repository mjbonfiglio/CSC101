import java.util.*;
import java.text.*;

class UnitConverter {
    public static void main(String[] args) {

        final double CM_PER_INCH = 2.54;
        Scanner key = new Scanner(System.in);
        DecimalFormat twoPlaces = new DecimalFormat("0.00");
        int action = 0;

        System.out.println("This program can convert inches to centimeters, and centimeters to inches. Enter what you would like to do:");
        while(action != 3) {

            printMenu();
            action = key.nextInt();

            if(action == 1) {
                System.out.print("Enter inches to be converted: ");
                double inch = key.nextDouble();
                System.out.println("<-------------------------------->\n" + inch + " inches is equal to: " + twoPlaces.format(inch * CM_PER_INCH) + " centimeters. \n<-------------------------------->");
            }

            else if(action == 2) {
                System.out.print("Enter centimeters to be converted: ");
                double input = key.nextDouble();
                double inches = convertToCm(input, CM_PER_INCH);
                System.out.println("<-------------------------------->\n" + input + " inches is equal to: " + twoPlaces.format(inches) + " inches. \n<-------------------------------->");
            }
            
            else if(action == 3) {
                System.out.println("Program ended, have a good day.");
            }
            
            else {
                System.out.println("<-------------------------------->\nInvalid entry: " + action + "\n<-------------------------------->");
            }
        }
    }

    public static void printMenu(){
        System.out.print("Enter 1 to convert in to cm\nEnter 2 to convert cm to in\nEnter 3 to exit and end program\nEnter here: ");
    }

    public static double convertToCm(double input, double CM_PER_INCH){
        return input / CM_PER_INCH;
    }
}
