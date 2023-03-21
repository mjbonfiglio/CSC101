//matt bonfiglio
//this program checks for if the users entered date is a leap year or not

import java.util.*;

public class LeapYearMB {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int year = 1;
        boolean error = true;       //initialize variables and classes
        String yearStatus = "";

        System.out.println("Hello, this program will tell you if the year you entered is a leap year, or enter 0 to end program.");

            while(year != 0){   //while user wants to continue

                while(error) { 
                    try{
                        System.out.print("Enter any positive integer, or enter 0 to exit program: ");   //get user input
                        year = key.nextInt();

                        if(year < 0){   //throw exceptions at invalid inputs
                            year = 1;
                            throw new Exception("You did not enter a positive integer!");
                        }

                        error = false;

                    }catch(InputMismatchException e){
                        System.out.println("You did not enter an integer!");
                        key.nextLine();
                    }catch(Exception e){        //catch exceptions
                        System.out.println(e.getMessage());
                        key.nextLine();
                        }
                    }

                    if(year != 0){
                        if(year % 400 == 0){
                            yearStatus = "a leap year!";        //determine leap year status
                        }else if(year % 100 == 0){
                            yearStatus = "not a leap year!";
                        }else if(year % 4 == 0){
                            yearStatus = "a leap year!";
                        }else{
                            yearStatus = "not a leap year!";
                        }
                    }

                    System.out.println(year + " is " + yearStatus);     //tell user answer

                    error = true;
        }
    }
}