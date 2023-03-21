//Matt Bonfiglio
//this is a rock paper scissors program! user enters their input, computer randomly generates their input, and it calculates the results and keeps track of stats

import java.util.*;

public class GameMB {
    public static void main(String[] args){
        Random rand = new Random();     //initialize random and scanner class
        Scanner key = new Scanner(System.in);

        int again = 1;
        boolean error = true;       //initialize variables
        String computerMove = "";
        String userMoveString = "";

        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLost = 0;
        int gamesTied = 0;


        System.out.println("Hello! this program lets you play rock paper scissors against me! ");

        while(again == 1){      //while loop driving whole program

            gamesPlayed++;      //increase games played

            int userMove = 0;

            error = true;

            while(error){       //while there is error or could be an error
                try{
                    System.out.print("Please enter '0' for rock, '1' for paper, or '2' for scissors: ");        //get user prompt
                    userMove = key.nextInt();
                    if(userMove > 2 || userMove < 0){       //throw errors for invalid inputs 0 < input < 2
                        throw new Exception("You did not enter a valid number!");
                    }
                    error = false;
                }catch(InputMismatchException e){
                    System.out.println("You did not enter an integer!");        //exceptions
                    key.nextLine();

                }catch(Exception e){    
                    System.out.println(e.getMessage());
                    key.nextLine();
                }
            }

            int gen = rand.nextInt(2);      //generate computer move

            switch(gen){        //swtich to change computer move to rock paper scissors lingo
                case 0:
                    computerMove = "Rock";
                    break;
                case 1:
                    computerMove = "Paper";
                    break;
                case 2:
                    computerMove = "Scissors";
                    break;

            }
            switch(userMove){       //swtich to change user move to rock paper scissors lingo
                case 0:
                    userMoveString = "Rock";
                    break;
                case 1:
                    userMoveString = "Paper";
                    break;
                case 2:
                    userMoveString = "Scissors";
                    break;
            }

            System.out.println("<--------------------------------->\nUser move: " + userMoveString + ", Computer move: " + computerMove);   //display moves

            if(userMoveString.equals(computerMove) == true){        //display win/loss/tie and change game stats
                System.out.println("it was a tie!\n<--------------------------------->");
                gamesTied++;
            }else{
                if(userMove == 0 && gen == 2){
                    System.out.println("You win!\n<--------------------------------->");
                    gamesWon++;
                }else if(userMove == 0 && gen == 1){
                    System.out.println("You lose!\n<--------------------------------->");
                    gamesLost++;
                }else if(userMove == 1 && gen == 0){
                    System.out.println("You win!\n<--------------------------------->");
                    gamesWon++;
                }else if(userMove == 1 && gen == 2){
                    System.out.println("You lose!\n<--------------------------------->");
                    gamesLost++;
                }else if(userMove == 2 && gen == 1){
                    System.out.println("You win!\n<--------------------------------->");
                    gamesWon++;
                }else if(userMove == 2 && gen == 0){
                    System.out.println("You lose!\n<--------------------------------->");
                    gamesLost++;
                }
            }

            error = true;
            while(error){       //try to repeat program
                try{
                    System.out.println("Do you want to play again? Enter '1' for yes, enter 0 for no");
                    again = key.nextInt();;

                    if(again < 0 || again > 1){
                        throw new Exception("You did not enter a valid integer!");
                    }

                    error = false;


                }catch(InputMismatchException e){
                    System.out.println("You did not enter an integer!");        //catch errors
                    key.nextLine();

                }catch(Exception e){
                    System.out.println("invalid input!");
                    key.nextLine();
                }
            }
        }

        System.out.println("Games played: " + gamesPlayed);
        System.out.println("Games won: " + gamesWon);       //if user ends program display stats
        System.out.println("Games lost: " + gamesLost);
        System.out.println("Games tied: " + gamesTied);
    }
}
