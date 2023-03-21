import java.util.*;
import java.text.*;

class Prism {
    public static void main(String[] args) {

        DecimalFormat twoPlaces = new DecimalFormat("0.00");
        Scanner key = new Scanner(System.in);
        boolean cont = true;

        System.out.println("This program computes the surface area and volume of a rectangular prism.");

        System.out.print("Enter unit of measurement (inches, feet, meters): ");
        String unit = key.nextLine();

        double length = 0;
        double height = 0;
        double breadth = 0;
        
        while(cont) {
            try{
                System.out.print("Enter prism length: ");
                length = key.nextDouble();
                if(length <= 0){
                    throw new Exception("You did not enter a positive integer!");
                }
                cont = false;
                System.out.println("You entered: " + length);
            }catch(InputMismatchException e){
                System.out.println("You did not enter a number!");
                key.nextLine(); //clear buffer
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        cont = true;
        while(cont) {
            try{
                System.out.print("Enter prism height: ");
                height = key.nextDouble();
                if(height <= 0){
                    throw new Exception("You did not enter a positive integer!");
                }
                cont = false;
                System.out.println("You entered: " + height);
            }catch(InputMismatchException e){
                System.out.println("You did not enter a number!");
                key.nextLine(); //clear buffer
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        cont = true;
        while(cont) {
            try{
                System.out.print("Enter prism breadth: ");
                breadth = key.nextDouble();
                if(breadth <= 0){
                    throw new Exception("You did not enter a positive integer!");
                }
                cont = false;
                System.out.println("You entered: " + breadth);
            }catch(InputMismatchException e){
                System.out.println("You did not enter a number!");
                key.nextLine(); //clear buffer
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("<----------------------------------->");
        double surfArea = 2 * (length + height + breadth);
        double volume = length * height * breadth;
        System.out.println("Surface area: " + twoPlaces.format(surfArea) + " " + unit);
        System.out.println("Volume: " + twoPlaces.format(volume) + " " + unit);
    }
}