//Matt Bonfiglio
//This program computes when you will be vested in a company based on time taken to be vested and the users hire date

import java.util.*;

class PensionMB{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        boolean error = true;
        String pattern = "[0][1-9]/[1-2][0-9]{3}|[1][1-2]/[1-2][0-9]{3}";   //pattern for entered date
        String hireDate = "";
        int years = 0;

        System.out.println("Welcome, this progam will compute when you will be fully vested.");

        while(error){   //get no error from input
            try{

                System.out.print("Enter how many years does it take for you to get fully vested: ");
                years = key.nextInt();

                if(years < 1 || years > 50){
                    throw new Exception("Your entered date is invalid!");   //if date invalid
                }

                error = false;

            }catch(InputMismatchException e){
                System.out.println("You did not enter an integer!");
                key.next();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        error = true;

        while(error){


            System.out.print("Enter hire date in the format mm/yyyy: ");
            hireDate = key.nextLine();

            if(hireDate.matches(pattern)){  //checks to see if entered date followed format
                error = false;
            }else{
                System.out.println("That did not follow the format!");
            }

        }

        String subMonth = hireDate.substring(0, 2);     //parse string to find month and day
        String subYear = hireDate.substring(3);
        int intYear = Integer.parseInt(subYear);
        
        int intMonth = Integer.parseInt(subMonth);

        int yearVested = intYear + years;

        String funcMonth = getMonth(intMonth);

        

        System.out.println("You will be fully vested in: " + funcMonth + ", " + yearVested);
        
       

        
        
        
    }

    public static String getMonth(int subMonth){    //function to return name of month based on number

        switch(subMonth){
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Null";
        }

    }
}