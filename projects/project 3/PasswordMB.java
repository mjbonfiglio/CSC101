//Matt Bonfiglio
//this program takes an input and checks if it satisfies the requirements to be a string password

import java.util.*;

class PasswordMB {
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);

        System.out.print("Enter password to See if it satisfies the rules: " );

        String specialCharacters = "[!-/][:-`][[-_]]";  //pattern for special characters

        String password = key.next();

        boolean hasEightCharacters = false; //booleans for each criteria
        boolean hasUpper = false;           
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for(int i = 0; i < password.length(); i++){ //parse through string
            Character chr = new Character(password.charAt(i));  //make a character for the ith char in the string
            if(Character.isUpperCase(chr)){ //check to see if it fits any criteria
                hasUpper = true;
            }else if(Character.isLowerCase(chr)){
                hasLower = true;
            }else if(Character.isDigit(chr)){
                hasNumber = true;
            }else if(chr.toString().matches(specialCharacters)){
                hasSpecial = true;
            }

            if(password.length() >= 8){ //check password length
                hasEightCharacters = true;
            }
        }

        if(hasEightCharacters && hasUpper && hasLower && hasNumber && hasSpecial){  //if its all good, print its valid
            System.out.println("This password is valid");
        }else{
            System.out.println("This password is invalid"); //if not, inform user what is missing
            if(!hasEightCharacters){
                System.out.println(" - missing 8 character length");
            }if(!hasUpper){
                System.out.println(" - missing uppercase letter");
            }if(!hasLower){
                System.out.println(" - missing lowercase letter");
            }if(!hasNumber){
                System.out.println(" - missing number");
            }if(!hasSpecial){
                System.out.println(" - missing special character");
            }
        }
        
    }
}
