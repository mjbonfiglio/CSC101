//Matt Bonfiglio
//This program compares user input answers to the answer sheet stored in an array

import java.util.*;
import java.text.*;

class TestGrader {
    public static void main(String[] args){
        System.out.println("This program will check your answers and return your grade.");
        DecimalFormat twoPlaces = new DecimalFormat("0.00");
        DecimalFormat zeroPlaces = new DecimalFormat("0");
        boolean error = true;
        String pattern = "[abcdABCD]{1}";
        Scanner key = new Scanner(System.in);
        String input;

        double correct = 0;

        char answers[] = new char[] {   'b', 'd', 'a', 'a', 'c', 'a', 'b', 'a', 'c', 'd', 'b', 'c', 'd', 'a', 'd', 'c', 'c', 'b', 'd', 'a'};
        for(int i = 0; i < 20; i++){

            error = true;
            while(error){

                System.out.print("Enter single letter answer to question " + (i + 1) + ": ");

                try{
                    input = key.nextLine();
                    
                    if(input.matches(pattern)){
                        if(Character.toLowerCase(input.charAt(0)) == answers[i]){
                            System.out.println("Correct");
                            correct++;
                        }else{
                            System.out.println("Incorrect");
                        }
                    error = false;
                    }else{
                        throw new Exception("Invalid Input!");
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("You answered: " + zeroPlaces.format(correct) + " questions correctly out of 20");

        double grade = (correct / 20) * 100;
        if(grade >= 75){
            System.out.println("You passed with a(n): " + twoPlaces.format(grade) + "%");
        }else{
            System.out.println("You failed with a(n): " + twoPlaces.format(grade) + "%");
        }

    }
}
