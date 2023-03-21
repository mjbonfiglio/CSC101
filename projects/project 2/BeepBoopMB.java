//Matt Bonfiglio
//this program prints the numbers counting up to a users input from 1 but it replaces certain numbers with words

import java.util.*;

class BeepBoopMB {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        boolean error = true;       //initializing variables and scanner
        int input = 0;

        System.out.println("Hello! This program will take an input and count up to it, and if it fits certain parameters it will print a word instead.");

        while(error) {
            try {       //i know i dont need to handle exceptions but i like it

            System.out.print("enter the integer I will count up to: ");
            input = key.nextInt();      //try to get input

            error = false;  //end loop

            }catch(Exception e){
                System.out.println("That was not a valid input!");
                key.nextLine();
            }
        }

        for(int i = 0; i <= input; i++){    //for the number of loops
            if(i % 3 == 0 && i % 4 == 0 && i % 5 == 0){     //3, 4, and 5
                System.out.println("SHAZAM");       
            }else if(i % 4 == 0 && i % 5 == 0){     //4 and 5
                System.out.println("POW");
            }else if(i % 3 == 0 && i % 5 == 0){     //3 and 5
                System.out.println("BLAMMO");         
            }else if(i % 3 == 0 && i % 4 == 0){     //3 and 4
                System.out.println("DING");
            }else if(i % 4 == 0){       //4
                System.out.println("BOOP");
            }else if(i % 5 == 0){       //5
                System.out.println("BLIP");
            }else if(i % 3 == 0){       //3
                System.out.println("BEEP");
            }else{
                System.out.println(i);
            }
        }

        System.out.println("Thank you");

    }
}