//Matt Bonfiglio
//MadLibs program; prompts user for 7 different words and numbers and creates a story with them
import java.util.*;

class MadLibsAA{
   public static void main(String[] args){
   
      Scanner key = new Scanner(System.in);
      
      System.out.println("Welcome to my MadLibs Program! You will be prompted with multiple inputs asking to enter a specific input, either a noun, adjective, verb, number, etc.");
         
      System.out.println("Enter a noun: ");
      String noun1 = key.next();
      
      System.out.println("Now enter another noun: ");
      String noun2 = key.next();
      
      System.out.println("Enter one more noun: ");
      String noun3 = key.next();

      System.out.println("Enter a verb ending in 'ing': ");
      String verb1 = key.next();
            
      System.out.println("Enter another verb ending in 'ing': ");
      String verb2 = key.next();
            
      System.out.println("enter an adjective: ");
      String adj1 = key.next();
      
      System.out.println("enter one more adjective: ");
      String adj2 = key.next();
      
      System.out.println("Enter a name (can be a first and last): ");
      String name = key.next();
      
      System.out.println("Enter any whole integer: ");
      int int1 = key.nextInt();
      

      
      System.out.println("-----------------------------");
      System.out.println("Once upon a time, a man wanted to go to the store to get " + int1 + " " + noun1 + "(s).");
      System.out.println("The man was " + verb1 + " towards the store when he tripped on a " + adj1 + " " + noun2);
      System.out.println("The " + noun2 + " angerly and shouted: 'Do you have any idea who I am?! I am " + name + "! You have no idea what you have just done!");
      System.out.println(name + " The " + noun2 + " summoned an army of " + adj2 + " " + noun3 + "s.\nThe army chased the man down the street until he leaped into a river, knowing the " + noun3 + "s could not swim.\nHe made it back home and took a well deserved nap. The End!");
   }
}