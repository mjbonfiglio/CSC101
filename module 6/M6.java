//Matt Bonfiglio
//this program is the M6 notes
import java.util.*;

class M6 {
    public static void main(String[] args) {
        //try and catch
        //when an error condition occurs, java "throws" an acception
        //all of these exceptions in the catch parimeters is in the java.util library
        //"e" is the object based in the input mismatch exception class, e is the name of the object being declared
        

        Scanner key = new Scanner(System.in);
        System.out.print("Enter a letter, I will try to store it as a number: ");

        try{    //try to run this code (it might cause errors)
            int input = key.nextInt();
        }catch(InputMismatchException e){  //if there is a mismatch error thrown
            System.out.println("You triggered a mismatch error!");  //do this
        }catch(Exception e){
            System.out.println("You caused another error!");
        }

        
        try{
            System.out.println(10 / 0);
        }catch(ArithmeticException e){
            System.out.println("You triggered an arithmetic acception by trying to divide a number by 0!");
        }finally{   //this code will run at the end unconditionally
            System.out.println("End");
        }

        key.nextLine(); //clearing buffer

        //create your own exception
        System.out.print("enter a number that is NOT 10 or 11 (enter 10, or 11): ");
        try{
            int num = key.nextInt();
            if(num == 10){
                throw new Exception("You entered 10!"); //throw the exception and store message for this exception
            }else if(num == 11){
                throw new Exception("You entered 11!");
            }else{
                throw new Exception("I hate you!");
            }
        }catch(Exception e){    //catch that custom acception
            System.out.println(e.getMessage());     //display message for that exception
        }finally{
            System.out.println("End");
        }


        //try and catch in loops
        System.out.print("Enter a letter I will try to store it as an integer: ");
        boolean flag = true;
        int inp = 0;
        while(flag){    //while flag var is true
            try{    //try to run the code
                inp = key.nextInt(); //try to store input
                flag = false;   //this is after the code that could throw an error and will end the while loop
            }catch(InputMismatchException e){    //catch error
                System.out.print("You tried to enter a letter! enter a number now: ");
                key.nextLine(); //clear buffer so the loop doesnt run forever
            }
        }
        System.out.println("You entered: " + inp);



        key.close();
    }
}