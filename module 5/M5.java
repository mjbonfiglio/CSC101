import java.util.*;

class M5 {
   public static void main(String[] args) {
   
      //while loop
      Scanner key = new Scanner(System.in);
      System.out.print("Enter max number: ");
      int max = key.nextInt();
      int count = 0;
      
      while (count <= max) {
         System.out.println("Count: " + count);
         count++;
      }

      //sentinal while loop
      System.out.print("Enter age: "); //prompt for age
      int age = key.nextInt();   //store age
      while (age < 0 || age > 120) {   //if the age is under 0 or above 120
         System.out.print("age is invalid! Enter valid integer: ");  //tell user age is invalid and demand new input
         age = key.nextInt();    //store input
      }
      System.out.println("Your age is: " + age);   //print input


      //do while loop
      //this is for always running the block of code at least once, then it checks the boolean to see if it needs to run again
      do {
         System.out.println("Hello!");//do this 
      }while (1 == 2);  //while this is true

      int a = 0;
      do {
         a++;
         System.out.println("A: " + a);
      }while (a != 10);

      //for loop
      //for (initializing control variable; boolean condition; change in control variable) {}
      for(int i = 0; i < 100; i++) {   //loop 100 times
         System.out.println(i);
      }
      
      for(int i = 0; i <= 100; i += 10) {   //loop 10 times
         System.out.println(i);
      }

      for(int i = 2; i <= 1000000000; i *= 2) {
         System.out.println(i);
      }
      
      for(int i = 0; i < 100; i++) {
         System.out.println(i);
         i = 100;
         System.out.println(i);
      }

      for(int minute = 0; minute < 60; minute++) {
         for(int second = 0; second < 60; second++) {
            System.out.println(minute + ":" + second);
         }
      }
      //jgrasp has a debugging tool that will execute your code very slowly and tell you what each variable is and whats stored in it
      //this is used by clicking next to the line number and it will, under that flag, tell you every variable and such while you manually progress the code
      
      
      //string formatting
      System.out.printf("I have %d cats.", 6);

      String str = "fart";
      System.out.printf("The action I am currently doing is: %s", str);

      int digit = 1;
      System.out.printf("%2d", digit); //width of each print

      
   }
}