import java.util.*;

class Adventure{
   public static void main(String[] args){
      Scanner key = new Scanner(System.in);
      System.out.println("Welcome! You are walking to the store to get some candy. Do you want to go down main street, or 10th street? Enter main or 10th");     
      
      String direction = key.next();
       
      if (direction.equals("main")) {
      
         System.out.println("You went down main street!");
         System.out.print("You encounter a man trying to steal a womans purse! Do you help her, or avoid the conflict? Enter help or ignore: ");
         
         String action = key.next();
         
         if (action.equals("help")) {
            System.out.println("You sprint towards the scene, and with the deepest and most powerful shout you can muster, you scream 'LEAVE HER ALONE!'\nThe assailent promptly beats you up and takes both yours and the womans wallets.");
         }
         else if (action.equals("ignore")) {
            System.out.println("You walk away quickly, trying to avoid making eye contact. You arrive at the store and get your candy... but at what cost?");
         }
         else {
            System.out.println("You did not enter a valid answer!");
         }
         
      }
      else if (direction.equals("10th")) {
         System.out.print("You went down 10th street! You arrive at the store, do you want a kit-kat, or a snickers? Enter kit-kat, or snickers: ");  
         String candy = key.next();
         
         if (candy.equals("kit-kat")) {
            System.out.println("The store owner kicks you out for having bad taste, you should be ashamed.");
         }
         else if (candy.equals("snickers")) {
            System.out.println("The store owner gives you a winning lottery ticket number for having superior taste buds.");
         }
         else {
            System.out.println("That was not a valid answer!");
         }
                         
      }
      else {
         System.out.println("You did not enter a valid answer!");
      }
   }
}