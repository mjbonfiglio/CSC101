import java.util.*;
import java.text.*;

class lab9Part1{
    public static void main(String[] args){
        double[] averageRain = {2.34, 2.04, 2.58, 2.75, 2.82, 3.36, 2.93, 3.54, 3.45, 2.60, 2.84, 2.73};
        double[] actualRain =  {1.92, 2.23, 1.02, 3.38, 1.28, 1.73, 7.66, 2.55, 3.16, 7.46, 1.72, 2.02};
        String[] monthsOfYear = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner key = new Scanner(System.in);
        DecimalFormat twoPlaces = new DecimalFormat("0.00");
        System.out.print("Rochester, NY Average and Actual rainfall (2021)\nEnter 1 for January, 2 for Febuary, etc: ");

        int input = key.nextInt();
        input -= 1;

        System.out.println("Month: " + monthsOfYear[input]);
        System.out.println("Average Rainfall: " + averageRain[input]);
        System.out.println("Actual Rainfall: " + actualRain[input]);
        System.out.println("Difference: " + twoPlaces.format(actualRain[input] - averageRain[input]));
        
    }
}