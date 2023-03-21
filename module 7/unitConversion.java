import java.util.*;
import java.text.*;

class UnitConverter {
    public static void main(String[] args) {

        final double CM_PER_INCH = 2.54;
        DecimalFormat twoPlaces = new DecimalFormat("0.00");
        int action = 0;
        Scanner key = new Scanner(System.in);

        System.out.println("This program can convert inches to centimeters, and centimeters to inches. Enter what you would like to do:");
        while(action != 3) {

            printMenu();
            action = key.nextInt();

            if(action == 1) {
                System.out.print("Enter inches to be converted: ");
                double input = getGoodDouble();
                double centimeters = convertToCm(input, CM_PER_INCH);
                System.out.println("<-------------------------------->\n" + input + " inches is equal to: " + twoPlaces.format(centimeters) + " centimeters. \n<-------------------------------->");
            }

            else if(action == 2) {
                System.out.print("Enter centimeters to be converted: ");
                double input = getGoodDouble();
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
        return input * CM_PER_INCH;
    }

    public static double couvertToInch(double input, double CM_PER_INCH){
        return input / CM_PER_INCH;
    }

    public static double getGoodDouble(){
        Scanner key = new Scanner(System.in);
        double input = 0;
        boolean error = true;
        while(error){
            try{
                input = key.nextDouble();
                if(input < 0){
                    throw new Exception("You did not enter a positive number!");
                }
                error = false;
            }catch(InputMismatchException e){
                System.out.println("You did not enter a double!");
                key.nextLine();
                System.out.print("Enter here: ");
            }catch(Exception e){
                System.out.println(e.getMessage());
                key.nextLine();
                System.out.print("Enter here: ");
            } 
        }
        return input;
    }
}

